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

        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            System.out.println("Speed Up -> " + i);
            rocket1.speedUp();

            System.out.println(rocket1.toString());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(" ");
            System.out.println("brake -> " + i);
            rocket1.brake();

            System.out.println(rocket1.toString());
        }
    }
}
