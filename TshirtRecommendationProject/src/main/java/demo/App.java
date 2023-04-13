package demo;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import demo.SearchInput.*;
import demo.SearchOutput.*;
import demo.data.Tshirt;
import demo.console.*;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        Input input = new Input();
        SearchInput SearchInput = input.getInput();

        SearchOutput Output = new SearchOutput();
        ArrayList<Tshirt> matchedTShirts = Output.getMatchingTshirts(SearchInput);

        Output output = new Output();
        output.displayOutput(matchedTShirts);

    }
}
