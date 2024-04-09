package learning.Deque;

import java.util.ArrayDeque;

public class LaunchAD {

	public static void main(String[] args) 
	{
		ArrayDeque ad=new ArrayDeque();
		ad.add("java");
		ad.addFirst(1);
		ad.addLast(3);
		System.out.println(ad);
		
		ArrayDeque ad2=new ArrayDeque();
		ad2.add("java");
		ad2.add(1);
		ad2.add(3);
		ad2.add(3);
		System.out.println(ad2);
		
		
		

	}

}
