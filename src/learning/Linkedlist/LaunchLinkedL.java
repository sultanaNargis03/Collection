package learning.Linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LaunchLinkedL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		
		
		
		list.addFirst(100);
		System.out.println(list);
		
		System.out.println("**********************");
		
		LinkedList list2=new LinkedList();
		
		list2.add(10);
		list2.add('J');
		list2.add("Java");
		list2.add(44.5);
		
		System.out.println(list2);
		System.out.println(list2.contains("Java"));
		System.out.println(list2.getFirst());
		System.out.println(list2.getLast());
		
		System.out.println(list2.peekFirst());
		System.out.println(list2);
		System.out.println(list2.pollFirst());
		System.out.println(list2);
		
	list2.offer(124);
	System.out.println(list2);
	list2.offerFirst(44);
	System.out.println(list2);
	
	list2.push(200);
	System.out.println(list2);
	list2.addFirst(450);
	System.out.println();
	System.out.println(list2.pop());
	System.out.println(list2);
		

	}

}
