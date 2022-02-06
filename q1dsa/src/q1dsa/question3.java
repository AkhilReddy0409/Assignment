package q1dsa;

import java.util.Scanner;

class SiCi {
    public double simpleInterest(double principalAmount,int time,double interestRate){
        double SI;
        SI = (principalAmount*time*interestRate)/100;
        return SI ;
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
        double CI;
        CI = (principalAmount * Math.pow((1.0+interestRate/100),time))-principalAmount;
        return CI;
    }
}
public class question3 {
    public static void main (String args[]) {
        double P,iR;int T;
        Scanner scan = new Scanner(System.in);
        System.out.println(" Principle Amount : ");
        P = scan.nextDouble();
        System.out.println(" Time Amount : ");
        T = scan.nextInt();
        System.out.println(" Rate of Interest : ");
        iR = scan.nextDouble();
        SiCi sci = new SiCi();
        System.out.println("Simple Interest :"+sci.simpleInterest(P,T,iR));
        System.out.println("Compound Interest :"+sci.compoundInterest(P,T,iR));
    }
}
