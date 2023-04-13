package demo.comparator;
import java.util.Comparator;
import demo.data.Tshirt;
public class Price implements Comparator<Tshirt> {
    public int compare(Tshirt t1,Tshirt t2) {
		
		return (int)(t1.getPrice()-t2.getPrice());
	}
    
}

