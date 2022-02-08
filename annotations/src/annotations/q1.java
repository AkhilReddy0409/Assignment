package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@interface Test {
	String name() default "TEST-CASE";
}

class Display {
	public void display() {

		System.out.println("ANNOTATION @Test CREATED");

	}
}

public class q1 {
	@Test
	public String tc() {
		return "testCase";
	}

	public static void main(String[] args) {
		Display d = new Display();
		d.display();
		// Custom Annotation @Test created

	}

}
