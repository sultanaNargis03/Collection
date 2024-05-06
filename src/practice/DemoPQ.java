package practice;

import java.util.PriorityQueue;

public class DemoPQ {

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add(25);
		pq.add(125);
		pq.add(120);
		pq.add(150);
		pq.add(50);
		pq.add(75);
		pq.add(225);
	//	pq.add(225); //duplicates are allowed
		pq.add(105);
	//	pq.add(null);	//null not allowed
	
		System.out.println(pq);
		
		PriorityQueue pq2=new PriorityQueue();
		pq2.add("25");
		pq2.add("12");
		pq2.add("12");
		pq2.add("15");
		pq2.add("50");
		pq2.add("75");
		
		//pq2.add("");	//null not allowed
		//pq2.add(null);	
		
		System.out.println(pq2);

	}

}
