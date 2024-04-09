package streamApi;
import java.util.ArrayList;

public class LaunchGen1 
{

	public static void main(String[] args) 
	{
		String []names=new String[3];
		names[0]="Rohan";
		names[1]="Rohit";
		//names[2]=10;
		String name1=names[0];
		
		System.out.println(name1.toUpperCase());
		System.out.println("**********************");
		ArrayList list=new ArrayList();
		list.add("Rohan");
		list.add("Rohit");
		list.add(100);
		
		String name=(String)list.get(0);
		System.out.println(name.toUpperCase());
		String name2=(String)list.get(2);
		System.out.println(name2.toLowerCase());
		

	}

}
