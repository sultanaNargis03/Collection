package test.LinkedList;

import java.util.*;

public class LaunchedLL 
{
	public static void main(String[] args) 
	{
		LinkedList list1=new LinkedList();
		
		list1.add(10);
		list1.addFirst(20);
		list1.addLast(30);
		list1.add(40);
		System.out.println(list1);
		System.out.println("****************************");
		
		LinkedList list2=new LinkedList();
		
		list2.add(10);
		list2.add('J');
		list2.add("Java");
		list2.add(44.5);
		
		System.out.println(list2);
//		System.out.println(list2.contains("Java"));
//		System.out.println(list2.indexOf(44.5));
	//	System.out.println(list2.peek());
		//System.out.println(list2);
//		System.out.println(list2.peekFirst());
//		System.out.println(list2);
		//System.out.println(list2.pollFirst());
		System.out.println(list2.poll());
		System.out.println(list2.poll());
		System.out.println(list2);
		
		list2.offer(100);
		System.out.println(list2);
		list2.push(3);//first in
		list2.add(90);
		list2.pop();//first out
		System.out.println(list2);
	}
}
