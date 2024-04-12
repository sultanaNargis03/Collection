package practice.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class Employee2 implements Comparable<Employee2>
{
	private Integer id;
	private String name;
	private Integer age;
	
	
	public Employee2() {
		super();
	}


	public Employee2(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Employee2 emp) {
		if(this.id>emp.id)
			return 1;
		else
			return -1;
	}
}	
public class ComplexSorting2 {

	public static void main(String[] args) 
	{
		Employee2 emp1=new Employee2(50,"Nargis",25);
		Employee2 emp2=new Employee2(12,"Tamim",15);
		Employee2 emp3=new Employee2(93,"Dona",20);
		
		List<Employee2> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

	}

}