package domain;

import java.util.Arrays;

public class Rocket {
    String id;
    int[] numPropellersPower;

    public Rocket() {
    }

    public Rocket(String id, int[] numPropellersPower) {
        this.id = id;
        this.numPropellersPower = numPropellersPower;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int[] getnumPropellersPower() {
        return numPropellersPower;
    }

    public void setnumPropellersPower(int[] numPropellersPower) {
        this.numPropellersPower = numPropellersPower;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "id='" + id + '\'' +
                ", numPropellers=" + Arrays.toString(numPropellersPower) +
                '}';
    }
}
