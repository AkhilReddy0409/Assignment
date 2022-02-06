package q1dsa;

public class question1 {
	

	    public static void main(String[] args) {

	        int number = 371, Number, remainder, result = 0;

	        Number = number;

	        while (Number != 0)
	        {
	            remainder = Number % 10;
	            result += Math.pow(remainder, 3);
	            Number /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    
	}

}
