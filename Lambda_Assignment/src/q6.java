import java.util.ArrayList;

public class q6 {
   public static void main(String[] args) throws CloneNotSupportedException {
      ArrayList<String> list = new ArrayList<>();
      list.add("array");
      list.add("list");
      list.add("replaceall");
      list.add("question6");
      list.add("assignment");
      list.replaceAll(s->s.toUpperCase());
      System.out.println(list);
   }
}