package practice;

import java.util.ArrayList;

public class LaunchAL
{
	public static void main(String[] args)
	{

		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(90);
		list.add(40);
		list.add(60);
		list.add(60);
		System.out.println(list);
		
		System.out.println("************************");
		
		ArrayList list2=new ArrayList();
		
		list2.add("java");
		list2.add(45.5f);
		list2.add(30);
		list2.add(90);
		list2.add(2,"SpringBoot");
		list2.add(60);
		System.out.println(list2.get(2));
		System.out.println(list2);
		System.out.println(list2.isEmpty());
		
		System.out.println("************************");
	}

}
