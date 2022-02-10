import java.util.ArrayList;
import java.util.List;

interface List1
{
	public   List<q2> listOforders(ArrayList<q2> list);
	}



public class q2 {
	private  int totalprice;
	private String status;

	public q2(int totalprice, String status) {
		super();
		this.totalprice = totalprice;
		this.status = status;
	}
	public static  ArrayList<q2> listOfOrders(ArrayList<q2> orders) 
	{
		orders.add(new q2(1000, "Accpeted"));
		orders.add(new q2(2000, "Completed"));
		orders.add(new q2(3000, "Completed"));
		return orders;
	}
	public String toString()
	{
		return totalprice+" "+status;
	}
	

	public static void main(String[] args) {
				ArrayList<q2> list1=new ArrayList<>();
		System.out.println(listOfOrders(list1));
		list1.forEach(a->{if(a.totalprice>1000 && (a.status.equals("Accpeted") || a.status.equals("Completed")))
					{
				System.out.println(a);
				
					}}
		);
	
		

	}

}