package demo.console;

import java.util.ArrayList;
import demo.data.Tshirt;

public class Output {
    public void displayOutput(ArrayList<Tshirt> matchedTshirts) {
        System.out.println(" Your Result:\n");

        if (matchedTshirts.isEmpty()) {
            System.out.println(",No tshirt is avaliable of your required choice");

        } else {

            for (Tshirt t : matchedTshirts) {

                System.out.println("ID:\t" + t.getId());
                System.out.println("NAME:\t" + t.getName());
                System.out.println("COLOR:\t" + t.getColor());
                System.out.println("GENDER:\t" + t.getGender());
                System.out.println("SIZE:\t" + t.getSize());
                System.out.println("PRIZE:\t" + t.getPrice());
                System.out.println("RATING:\t" + t.getRating());
                System.out.println("AVALIABILITY:\t" + t.getAvalibilty());
                System.out.println();
            }

        }
    }

}
