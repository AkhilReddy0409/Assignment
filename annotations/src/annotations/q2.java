package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface Info {
	int AuthorID() default 123; 
	String Author() default "Developer";
	String Supervisor() default "DSV"; 
	String Date() default "07/02/2022";
	String Time() default "6:30 pm"; 
	int  Version() default 01;
	String Description() default "Used On Classes";
}


public class q2 {

	public static void main(String[] args) {
		
		// Custom Annotation @Info created
		/**            Question 
		 *
a) AuthorID: <<Developers ID>> - (Mandatory Input)
b) Author: <<Developers name>> - (Optional Input)
c) Supervisor: <<Developers Supervisor>> - (Optional Input)
d) Date: <<”String Date”>> - (Mandatory Input)
e) Time: <<”String Time”>> - (Mandatory Input)
f) Version: <<Numerical Version >> - (Mandatory Input)
g) Description: <<Description of the class, method, or property >> - (Optional Input)
		 */
	}

}
