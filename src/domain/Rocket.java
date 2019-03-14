package domain;

import java.util.Arrays;
import java.util.List;

public class Rocket {
    private final static int SPEEDUP_BREAK_POWERSTEP = 10;
    private final static int TIME_STEP = 10; // seconds
    private String id;
    private List<Propeller> propellerList;
    private float currentSpeed; // I guess m/s
    private float distance; // I guess m

    public Rocket() {
    }

    public Rocket(String id, List<Propeller> propellerList) {
        this.id = id;
        this.propellerList = propellerList;
        this.currentSpeed = 0; // not necessary but it's more understandable if we do it explicit.
        this.distance = 0f;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Propeller> getPropellerList() {
        return propellerList;
    }

    public void setPropellerList(List<Propeller> propellerList) {
        this.propellerList = propellerList;
    }

    public float getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(float currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Rocket{\n" +
                "       id='" + id + "\'\n" +
                "       propellerList=" + propellerList.toString() + "\n" +
                "       currentSpeed=" + currentSpeed + "\n" +
                "       distance=" + distance + "\n" +
                '}';
    }

    public void speedUp(){
        boolean anyChange = false;

        for(Propeller auxPropeller: propellerList){
            int diff = auxPropeller.getMaxPower() - auxPropeller.getCurrentPower();
            int step = 0;

            if(diff > 0){
                if(diff > SPEEDUP_BREAK_POWERSTEP){
                    step = SPEEDUP_BREAK_POWERSTEP;
                } else{
                    step = diff;
                }

                auxPropeller.setCurrentPower(auxPropeller.getCurrentPower() + step);

                anyChange = true;
            }
        }

        if(anyChange){
            this.currentSpeed = this.currentSpeed + calculateDeltaSpeed();
        }

        this.distance = this.distance + calculateDistance(1);
    }

    public void brake(){
        int decreassingGenricStep = (-1)*SPEEDUP_BREAK_POWERSTEP;
        boolean anyChange = false;

        for(Propeller auxPropeller: propellerList){
            int diff = 0 - auxPropeller.getCurrentPower();
            int step = 0;

            if(diff < 0){
                if(diff < decreassingGenricStep){
                    step = decreassingGenricStep;
                } else{
                    step = diff;
                }

                auxPropeller.setCurrentPower(auxPropeller.getCurrentPower() + step);

                anyChange = true;
            }
        }

        if(anyChange){
            this.currentSpeed = this.currentSpeed - calculateDeltaSpeed();
        }

        this.distance = this.distance + calculateDistance(1);
    }

    private float calculateDeltaSpeed(){
        float newSpeed = 0f;
        int currentPowerSummatory = 0;

        for(Propeller auxPropeller: propellerList){
            currentPowerSummatory = currentPowerSummatory + auxPropeller.getCurrentPower();
        }

        newSpeed = (100 *  (float) Math.sqrt(currentPowerSummatory));

        return newSpeed;
    }

    public float calculateDistance(int numTimeCycles){
        return this.currentSpeed * numTimeCycles * TIME_STEP;
    }
}
