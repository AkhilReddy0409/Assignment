package Q3;

public class CA extends bank {
	int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public void getCash() {
    	int t= totalDeposits + creditLimit;
		System.out.println("Amount in Current Account is : "+t);
    	
    }

}
