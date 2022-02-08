package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute {
	int Sequence();
}
public class q3 {
	@Execute(Sequence=2)
	public void myMethod1(){
		System.out.println("IN myMethod1");
	}
	@Execute(Sequence=1)
	public void myMethod2(){
		System.out.println("IN myMethod2");
	}
	@Execute(Sequence=3)
	public void myMethod3(){
		System.out.println("IN myMethod3");
	} 
	
	public static void main(String[] args) {
		System.out.println("ANNOTATION @Execute CREATED");
		q3 q=new q3();
		q.myMethod2();
		q.myMethod1();
		q.myMethod3();
	}

}
