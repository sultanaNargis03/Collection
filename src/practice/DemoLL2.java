package practice;

import java.util.LinkedList;

public class DemoLL2 {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		ll.add(5);
		ll.add(0,6);
		//ll.offer(8);	//duplicates are allowed
		ll.offer(8);
		ll.addFirst(9);
		ll.offerFirst(1);
		//System.out.println(ll.peekFirst());
		ll.addLast(90);
		//System.out.println(ll.pollFirst());
		ll.offerLast(10);
		ll.add(" ");	//null value allowed
		System.out.println(ll);
		System.out.println(ll.size());
	}

}
