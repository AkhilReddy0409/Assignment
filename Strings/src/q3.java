
public class q3 {

	public static void main(String[] args) {
		String s="Java String pool refers to collection of Strings which are stored in heap memory";
		String sa=s.toLowerCase();
		String sb=s.toUpperCase();
		String sc=s.replace("a", "$");
		boolean sd=s.contains("collection");
		boolean se=s.contentEquals("java string pool refers to collection of strings which are stored in heap memory");
		boolean sf=s.equalsIgnoreCase("java string pool refers to collection of strings which are stored in heap memory");
System.out.println(s);
System.out.println(sa);
System.out.println(sb);
System.out.println(sc);
System.out.println(sd);
System.out.println(se);
System.out.println(sf);
	}

}
