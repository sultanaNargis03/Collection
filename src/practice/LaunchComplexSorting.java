package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
	int id;
	int age;
	String name;
	public Employee(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
}
//class Alpha implements Comparator<Employee>
//{
//
//	@Override
//	public int compare(Employee o1, Employee o2) 
//	{
//		if(o1.id>o2.id)
//			return 1;	//swap
//		else
//			return -1;
//	}
//	
//}

public class LaunchComplexSorting {

	public static void main(String[] args) 
	{
		
		Employee emp1=new Employee(3,24,"Tamim");
		Employee emp2=new Employee(2,25,"Nargis");
		Employee emp3=new Employee(1,14,"Sultana");
		
		List<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(list);
		//Alpha alpha=new Alpha();
//		Comparator com=new Comparator<Employee>()
//		{
//			public int compare(Employee o1, Employee o2) 
//			{
//				if(o1.age>o2.age)
//					return 1;	//swap
//				else
//					return -1;
//			}
//		};
//		Comparator<Employee> com=(Employee o1, Employee o2)->
//		{
//				if(o1.age>o2.age)
//					return 1;	//swap
//				else
//					return -1;
//			
//		};
		
		Collections.sort(list, (Employee o1, Employee o2)->
								{	if(o1.age>o2.age)
										return 1;	//swap
									else
										return -1;
								}
					    );
		
		
		//Collections.sort(list,alpha);
		System.out.println(list);

	}

}
