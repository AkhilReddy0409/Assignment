package Q2;

public class emp {
int getSalary=10000;
	public void getSalary() {
		
		 System.out.println("EMP Salary - 10,000");	
	}
	public static void main(String[] args) {
		
		emp e= new emp();
		manager m= new manager();
		labour l =new labour();
		e.getSalary();
		m.getSalary();
		l.getSalary();
		
	}

}
