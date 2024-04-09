package streamApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
{
	 int id;
	 String name;
	 int age;
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}


//class Alpha1 implements Comparator<Employee>
//{
//	@Override
//	public int compare(Employee obj1, Employee obj2)
//	{
//		if(obj1.id>obj2.id)
//		return 1;
//		else
//		return -1;
//	}
//}
public class LaunchComplexSorting 
{

	public static void main(String[] args) 
	{
		
		Employee emp1=new Employee(3, "Rohan", 18);
		//System.out.println(emp1);
		
		Employee emp2=new Employee(2, "Vishal", 15);
		//System.out.println(emp2);
		
		Employee emp3=new Employee(4, "Mehu", 16);
		//System.out.println(emp3);
		
		//System.out.println(10);
		
		List<Employee> list=new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		
		System.out.println("Before sort : "+list);
		//Alpha1 alpha=new Alpha1();
		//Collections.sort(list);
		
//		Comparator<Employee> sorting= new Comparator<Employee>()
//		{
//			@Override
//			public int compare(Employee obj1, Employee obj2)
//			{
//				if(obj1.id>obj2.id)
//				return 1;
//				else
//				return -1;
//			}
//			
//			};
		
//		Comparator<Employee> sorting=(Employee ref1, Employee ref2)->
//		{
//			if(ref1.id>ref2.id)
//			return 1;
//			else
//			return -1;
//		};
		Collections.sort(list, (Employee ref1, Employee ref2)->
		{
			if(ref1.id>ref2.id)
			return 1;
			else
			return -1;
		});
		System.out.println("After sort : "+list);
		

	}

}
