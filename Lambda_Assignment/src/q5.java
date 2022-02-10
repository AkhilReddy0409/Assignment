import java.util.Arrays;
import java.util.List;

public class q5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
		StringBuilder str = new StringBuilder();
		list.forEach(s -> str.append(s.charAt(0)));
		System.out.println(str);

	}

}