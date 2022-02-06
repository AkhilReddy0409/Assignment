package Q3;

public class SA extends bank {
	int totalDeposits = 10000;
	 int fixedDepositAmount = 5000;
    @Override
    public void getCash() {
    	int t= totalDeposits + fixedDepositAmount;
		System.out.println("Amount in Savings Account is : "+t);
    	
    }

}
