package demo.SearchOutput;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import demo.data.*;
import demo.SetTshirtData;
import demo.SearchInput.SearchInput;
import demo.comparator.*;

public  class SearchOutput {
    Scanner obj;

    public  ArrayList<Tshirt> getMatchingTshirts(SearchInput searchInput) throws FileNotFoundException {

        ArrayList<Tshirt> tshirt = new ArrayList<Tshirt>();
        ArrayList<Tshirt> allTshirtData = SetTshirtData.getTshirts();

        String inputFormat = String.format("%s,%s,%s", searchInput.getColor(), searchInput.getSize(),
                searchInput.getGender());

        String outputFormat;
        String output = searchInput.getOutputPreference().name();

        System.out.println("Your choice of Output Preference is : ");

        for (Tshirt allTshirtDataiterator : allTshirtData) {

            outputFormat = String.format("%s,%s,%s", allTshirtDataiterator.getColor(), allTshirtDataiterator.getSize(),
                    allTshirtDataiterator.getGender());

            if (inputFormat.equalsIgnoreCase(outputFormat))
                tshirt.add(allTshirtDataiterator);

        }

        if (output.equalsIgnoreCase("Price")) {

            Collections.sort(tshirt, new Price());
            System.out.println(output);

        } else if (output.equalsIgnoreCase("Rating")) {

            Collections.sort(tshirt, new Rating());
            System.out.println(output);

        } else {

            Collections.sort(tshirt, new Price());
            Collections.sort(tshirt, new Rating());
            System.out.println(output);

        }

        System.out.println("\n\n");

        return tshirt;
    }

}
