package demo.console;

import java.util.Scanner;
import demo.SearchInput.*;
import demo.data.*;

public class Input {
    public String getColor(Scanner s) {
        boolean isValid = true;
        System.out.println("Enter color of Tshirt:\n( Black,White,Blue,Purple,Grey,Pink,Maroon,Yellow)");

        String colorType = "";
        do {
            try {
                colorType = s.nextLine();
               
                if (Color.valueOf(colorType.toUpperCase()) != null)
                    isValid = false;

            } catch (IllegalArgumentException e) {
                System.out.println(
                        "Enter a valid color of Tshirt:\n(available: Black,White,Blue,Purple,Grey,Pink,Maroon,Yellow)");
            }
        } while (isValid);
        return colorType;
    }

    public String getSize(Scanner s) {
        boolean isValid = true;
        System.out.println("Enter size of Tshirt: \n(choose: S , M , L, XL )");

        String sizeType = "";
        do {
            try {
                sizeType = s.nextLine();
                if (Size.valueOf(sizeType.toUpperCase()) != null)
                    isValid = false;

            } catch (IllegalArgumentException e) {
                System.out.println("Enter a valid size of Tshirt:\n(choose: S , M , L, XL )");
            }

        } while (isValid);
        return sizeType;
    }

    public String getGender(Scanner s) {
        boolean isValid = true;
        System.out.println("Gender : \n(M-male,F-female,U-unisex)");

        String gender = "";
        do {
            try {
                gender = s.nextLine();
                if (Gender.valueOf(gender.toUpperCase()) != null)
                    isValid = false;

            } catch (IllegalArgumentException e) {
                System.out.println("Enter a valid Gender:\n(M-male , F-femle,U-unisex )");
            }
        } while (isValid);
        return gender;
    }

    public String getOutputPreference(Scanner s) {
        boolean isValid = true;
        System.out.println("Enter sorting output preference of Tshirt : \n(Price,Rating,Both)");

        String outputPreference = "";
        do {
            try {
                outputPreference = s.nextLine();
                if (OutputPreference.valueOf(outputPreference.toUpperCase()) != null)
                    isValid = false;

            } catch (IllegalArgumentException e) {
                System.out.println("Enter a valid output preference:");
            }
        } while (isValid);
        return outputPreference;
    }

    public SearchInput getInput() {

        SearchInput SearchInput = new SearchInput();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the Required Details:\n");

        String color = getColor(s);
        String size = getSize(s);
        String gender = getGender(s);
        String outputPreference = getOutputPreference(s);

        SearchInput.setColor(Color.valueOf(color.toUpperCase()));
        SearchInput.setSize(Size.valueOf(size.toUpperCase()));
        SearchInput.setGender(Gender.valueOf(gender.toUpperCase()));
       SearchInput.setOutputPreference(OutputPreference.valueOf(outputPreference.toUpperCase()));

        return SearchInput;
    }

}

