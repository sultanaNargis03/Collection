package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee2 implements Comparable<Employee2>
{
	int id;
	int age;
	String name;
	public Employee2(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee2 ref)
	{
		if(this.id>ref.id)
			return 1;
		else
			return -1;
	}
	
}

public class LaunchComplexSorting2 
{

	public static void main(String[] args) 
	{
		Employee2 emp1=new Employee2(3,24,"Tamim");
		Employee2 emp2=new Employee2(2,25,"Nargis");
		Employee2 emp3=new Employee2(1,14,"Sultana");
		
		List<Employee2> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

	}

}
