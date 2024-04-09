package practice;

import java.util.LinkedList;

public class LaunchLinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList list=new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1,50);
		list.addFirst(0);
		list.addLast(60);
		list.add(10);
		
		System.out.println(list.peekFirst());
		System.out.println(list.offer(100));
		
		System.out.println(list.peekFirst());
		//System.out.println(list);
		System.out.println(list.pollFirst());
		
		System.out.println(list.offer(200));
		
		System.out.println(list.contains("Java"));
		System.out.println(list);
	}

}
