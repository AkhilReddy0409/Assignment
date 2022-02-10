import java.util.Map;
import java.util.TreeMap;

public class q7 {
	public static void main(String[] args) {
		Map<String ,String> map=new TreeMap<>();
		map.put(" k1", "v1");
		map.put("k2", "v2");
		StringBuilder sb = new StringBuilder();		
		map.entrySet().forEach(entry->{sb.append(entry.getKey());
	    sb.append('=');
	    sb.append(entry.getValue());
	    sb.append(' ');
	    });
		sb.deleteCharAt(sb.length() - 1);
		String result = sb.toString();
		System.out.println(result);
	}

}