package generics;

public class q3 {
	public <T> T[] exchange(T[] arr)
	{
		for(int i=0;i<arr.length/2;i++)
		{
			T temp;
			temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		Integer arr[]= {1,2,3};
		String arr1[]= {"exchange","Assignment","values","Strings"};
		q3 ass1=new q3();
		Integer a[]=ass1.exchange(arr);
		String a3[]=ass1.exchange(arr1);
		for (Integer a2:a)
		{
			System.out.println(a2);
		}
		for (String a2:a3)
		{
			System.out.println(a2);
		}

	}

}
