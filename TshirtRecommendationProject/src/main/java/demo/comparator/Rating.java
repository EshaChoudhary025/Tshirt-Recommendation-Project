package demo.comparator;

import java.util.Comparator;
import demo.data.*;

public class Rating implements Comparator<Tshirt> {
    public int compare(Tshirt t1, Tshirt t2) {

        return (int) (t2.getRating() - t1.getRating());
    }

}