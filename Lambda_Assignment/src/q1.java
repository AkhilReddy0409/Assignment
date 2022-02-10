interface op {
	double operations(int a, int b);
}

public class q1 {

	public static void main(String[] args) {
		op addition = (int a, int b) -> (a + b);
		System.out.println("add " + addition.operations(10, 5));

		op multi = (int a, int b) -> (a * b);
		System.out.println("multiplication" + multi.operations(10, 5));

		op divi = (int a, int b) -> (a / b);
		System.out.println("division " + divi.operations(10, 5));

		op sub = (int a, int b) -> (a - b);
		System.out.println("subtraction " + sub.operations(10, 5));

	}

}