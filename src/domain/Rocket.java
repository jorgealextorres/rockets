package domain;

import java.util.Arrays;
import java.util.List;

public class Rocket {
    private final static int SPEEDUP_BREAK_POWERSTEP = 10;
    private String id;
    private List<Propeller> propellerList;

    public Rocket() {
    }

    public Rocket(String id, List<Propeller> propellerList) {
        this.id = id;
        this.propellerList = propellerList;
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

    @Override
    public String toString() {
        return "Rocket{" +
                "id='" + id + '\'' +
                ", propellerList=" + propellerList.toString() +
                '}';
    }

    public void speedUp(){
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
            }
        }
    }

    public void brake(){
        int decreassingGenricStep = (-1)*SPEEDUP_BREAK_POWERSTEP;

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
            }
        }
    }
}
