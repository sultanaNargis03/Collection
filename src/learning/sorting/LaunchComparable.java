package learning.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee implements Comparable<Employee>
{
	private String name;
	private int age;
	private String city;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		if(this.age>emp.age)
			return 1;	//swap
		else
		return -1;
	}
	
}
public class LaunchComparable 
{
	public static void main(String[] args) 
	{
		Employee p1=new Employee("Nargis",22,"Kol");
		Employee p2=new Employee("Tamim",14,"BLR");
		
		ArrayList list=new ArrayList();
		list.add(p1);
		list.add(p2);
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		

					
	}
}
