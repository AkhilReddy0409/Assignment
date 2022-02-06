package Q4;

abstract class ab{  
 public abstract void display();
}
class ab1 extends ab{
	public void display() {
		System.out.println("THIS IS AB1 Class");	
	}
}
class Abstract{
	public static void main(String[] args) {
		ab1 a =new ab1();
		a.display();
	}

}
