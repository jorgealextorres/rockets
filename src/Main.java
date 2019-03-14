import domain.Propeller;
import domain.Rocket;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int numSequenceForPropellers = 1;

        List<Propeller> propellerListRocket1 = new ArrayList<>();
        propellerListRocket1.add(new Propeller(numSequenceForPropellers++, 10));
        propellerListRocket1.add(new Propeller(numSequenceForPropellers++, 30));
        propellerListRocket1.add(new Propeller(numSequenceForPropellers++, 80));

        Rocket rocket1 = new Rocket("32WESSDS", propellerListRocket1);

        List<Propeller> propellerListRocket2 = new ArrayList<>();
        propellerListRocket2.add(new Propeller(numSequenceForPropellers++, 30));
        propellerListRocket2.add(new Propeller(numSequenceForPropellers++, 40));
        propellerListRocket2.add(new Propeller(numSequenceForPropellers++, 50));
        propellerListRocket2.add(new Propeller(numSequenceForPropellers++, 50));
        propellerListRocket2.add(new Propeller(numSequenceForPropellers++, 30));
        propellerListRocket2.add(new Propeller(numSequenceForPropellers++, 10));

        Rocket rocket2 = new Rocket("LDSFJA32", propellerListRocket2);

        System.out.println(rocket1.toString());
        System.out.println(rocket2.toString());

        // 3 speed up for both rockets
        System.out.println("=======================");
        for (int i = 0; i < 3; i++) {
            System.out.println(" ");
            System.out.println("Speed Up -> " + (i+1));
            rocket1.speedUp();

            System.out.println(rocket1.toString());

            rocket2.speedUp();

            System.out.println(rocket2.toString());
        }
        System.out.println("=======================");
        System.out.println("After 3 speed up : ");
        System.out.println(rocket1.toString());
        System.out.println(rocket2.toString());

        // start simultaneous actions
        // 5 brake for rocket 1
        System.out.println("=======================");
        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            System.out.println("brake -> " + (i+1));
            rocket1.brake();

            System.out.println(rocket1.toString());
        }
        System.out.println("=======================");

        System.out.println("After 5 brake for rocket 1 ('32WESSDS') : ");
        System.out.println(rocket1.toString());
        System.out.println(rocket2.toString());

        // 7 speed up for rocket 2
        System.out.println("=======================");
        for (int i = 0; i < 7; i++) {
            System.out.println(" ");
            System.out.println("Speed Up -> " + (i+1));
            rocket2.speedUp();

            System.out.println(rocket2.toString());
        }

        // 2 time cycles for distance in rocket 1 ( 5 cycles for sepeed up rocket 1 - 7 cycles for brake rocket 2)
        rocket1.setDistance(rocket1.getDistance() + rocket1.calculateDistance(2));

        // finish simultaneous actions

        System.out.println("=======================");
        System.out.println("After 7 speed up for second rocket ('LDSFJA32') : ");
        System.out.println(rocket1.toString());
        System.out.println(rocket2.toString());

        // 15 speed up for both rockets
        System.out.println("=======================");
        for (int i = 0; i < 15; i++) {
            System.out.println(" ");
            System.out.println("speed up -> " + (i+1));
            rocket1.speedUp();

            System.out.println(rocket1.toString());

            rocket2.speedUp();

            System.out.println(rocket2.toString());
        }
        System.out.println("=======================");

        System.out.println("After 15 speed up for both rockets : ");
        System.out.println(rocket1.toString());
        System.out.println(rocket2.toString());
    }
}
