package test.ArrayList;

import java.util.*;

public class LaunchAL 
{
	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		
		list1.add(10);
		list1.add(20);
		list1.add(70);
		list1.add(30);
		
		System.out.println(list1);
		System.out.println("******************************");
		
		ArrayList list2=new ArrayList();
		
		list2.add(10.5f);
		list2.add("java");
		list2.add(70000000000l);
		list2.add(30);
		
		System.out.println(list2);
		System.out.println("******************************");
		
		ArrayList list3=new ArrayList();
		list3.addAll(list2);
		list3.addAll(list1);
		list3.add("new data");
		list3.add(300);
		list3.add(0,40);
		System.out.println(list3.get(5));
		System.out.println(list3.containsAll(list1));
//		
//		System.out.println(list3);
		
	}
}
