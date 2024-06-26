package learning.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person
{
	private String name;
	private int age;
	private String city;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String city) {
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
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
}
public class LaunchComparator 
{
	public static void main(String[] args) 
	{
		Person p1=new Person("Nargis",22,"Kol");
		Person p2=new Person("Tamim",14,"BLR");
		
		ArrayList list=new ArrayList();
		list.add(p1);
		list.add(p2);
		//System.out.println(list);
		Collections.sort(list,(Person o1, Person o2)->
		{
			if(o1.getAge()>o2.getAge())
			{
				return 1;	//swap
			}
			else
				
				return -1;
		});
		System.out.println(list);

					
	}
}
