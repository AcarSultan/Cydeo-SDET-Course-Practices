package tasks.day_2;

public class EligibleToWork {
    public static void main(String[] args) {


        // Driving Status According to Virginia
        // Condition 1: Person must be 18+ AND have a driver's license
        // OR
        // Condition 2: Person must be at least 15 years and 6 months old AND "Proof of age"


        String name = "Mike";
        String name2 = "Mary";
        boolean driversLicense = false;
        boolean lernersPermit = true;
        double age = 20.0;

        System.out.println(((age >= 18 && driversLicense) || (age > 15.6 && lernersPermit)));


    }
}

}
