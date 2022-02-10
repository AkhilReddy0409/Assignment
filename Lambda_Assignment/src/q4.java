import java.util.ArrayList;
import java.util.List;

public class q4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("even");
		list.add("odd");
		list.add("ONE-ODD");
		list.removeIf(s -> (s.length() % 2 != 0));
		System.out.println(list);

	}

}