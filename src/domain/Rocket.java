package domain;

public class Rocket {
    String id;
    int numPropellers;

    public Rocket() {
    }

    public Rocket(String id, int numPropellers) {
        this.id = id;
        this.numPropellers = numPropellers;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumPropellers() {
        return numPropellers;
    }

    public void setNumPropellers(int numPropellers) {
        this.numPropellers = numPropellers;
    }

    @Override
    public String toString() {
        return "Rocket{" +
                "id='" + id + '\'' +
                ", numPropellers=" + numPropellers +
                '}';
    }
}
