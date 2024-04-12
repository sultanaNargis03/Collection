package practice.streamapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
	private Integer id;
	private String name;
	private Integer age;
	
	
	public Employee() {
		super();
	}


	public Employee(Integer id, String name, Integer age) {
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
	
	
}

//class Alpha implements Comparator<Employee>
//{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		if(o1.getId()>o2.getId())
//			return 1;
//		else
//			return -1;
//	}	
//	
//}

public class ComplexSorting {

	public static void main(String[] args) 
	{
		Employee emp1=new Employee(12,"Nargis",25);
		Employee emp2=new Employee(2,"Tamim",15);
		Employee emp3=new Employee(93,"Dona",20);
		
		List<Employee> list=new ArrayList();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		System.out.println("Before sort: ");
		System.out.println(list);
	//	Collections.sort(list);
		
//		Alpha alpha=new Alpha();
//		System.out.println(alpha.compare(emp2, emp3));
		
//		Comparator<Employee> sorting=new Comparator<Employee>()
//				{
//
//					@Override
//					public int compare(Employee o1, Employee o2) 
//					{
//						if(o1.getId()>o2.getId())
//							return 1;
//						else
//							return -1;
//					}
//				};	
				
//				Comparator<Employee> sorting=(Employee o1, Employee o2)->
//				{
//
//						if(o1.getId()>o2.getId())
//							return 1;
//						else
//							return -1;
//					
//				};	
		
		Collections.sort(list, (Employee o1, Employee o2)->
								{
						
										if(o1.getId()>o2.getId())
											return 1;
										else
											return -1;		
								}
				);
		System.out.println(list);
	}

}
