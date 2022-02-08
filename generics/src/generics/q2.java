package generics;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random; 
public class q2 {
	public static void main(String[] args) {
		
		HashMap<Integer,Double > random = new HashMap<>();
		random.put(01,11.00);
		random.put(01,11.00);
		random.put(01,11.00);
		random.put(01,11.00);
		random.put(01,11.00);
		random.put(01,11.00);
		random.put(01,11.00);
		random.put(01,11.00);
		random.put(01,11.00);
		random.put(01,11.00);
 
		Object[] Keys = random.keySet().toArray();
		Object key = Keys[new Random().nextInt(Keys.length)];
	
		List<Map.Entry<Integer,Double>> list = new ArrayList<Map.Entry<Integer,Double>>();
		System.out.println("\n  list ");
		Collections.shuffle(list);
		for (Entry<Integer, Double> entry : list) {
			System.out.println(entry.getKey() + " :: " + entry.getValue());
		}
	}
}