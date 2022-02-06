package exceptionHandling;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Number");
    int a = sc.nextInt();
    System.out.println("Enter 2nd Number");
    int b = sc.nextInt();
    try {
        int c = a/b;  // cannot divide by zero
        System.out.println ("Result = " + c);
    }
    catch(ArithmeticException e) {
        System.out.println ("Can't divide a number by 0");
    }
	}

}
