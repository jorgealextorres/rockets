import domain.Rocket;

public class Main {

    public static void main(String[] args) {
        Rocket rocket1 = new Rocket("32WESSDS", new int[]{10, 30, 80});
        Rocket rocket2 = new Rocket("LDSFJA32", new int[]{30,40,50,50,30,10});

        System.out.println(rocket1.toString());
        System.out.println(rocket2.toString());

    }
}
