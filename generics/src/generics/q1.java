package generics;

import java.util.HashSet;

public class q1<T> 
{
	public int id;
	public String name;
	public int salary;
	public String dept;
	public q1(int id,String name,String dept,int salary) 
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
	}
	public void display()
	{
		HashSet<String> hs=new HashSet<>();
		hs.add(name);
		hs.add(dept);
		for(String employee:hs)
		{
			System.out.println(employee);
		}
		HashSet<Integer> hs1=new HashSet<>();
		hs1.add(id);
		hs1.add(salary);
		for(Integer employee:hs1)
		{
			System.out.println(employee);
		}
	}

	public static void main(String[] args) {
		q1<String> str=new q1<>(123, "ABC", "IT",30000);
		str.display();

	}

}
