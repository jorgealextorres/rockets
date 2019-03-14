package domain;

public class Propeller {
    private int id;
    private int maxPower;
    private int currentPower;

    public Propeller() {
    }

    public Propeller(int id, int maxPower) {
        this.id = id;
        this.maxPower = maxPower;
        this.currentPower = 0; // Not necessary but it's better to understand to do it explicit.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getCurrentPower() {
        return currentPower;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    @Override
    public String toString() {
        return "Propeller{" +
                "id=" + id +
                ", maxPower=" + maxPower +
                ", currentPower=" + currentPower +
                '}';
    }
}
