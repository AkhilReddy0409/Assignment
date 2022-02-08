package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class q2 {

	public static void main(String[] args) {

		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);

		}
		set.addAll(list);
		System.out.println(set);

	}

}
