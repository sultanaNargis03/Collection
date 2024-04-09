package practice;

import java.util.ArrayDeque;

public class LaunchArrayDequeue {

	public static void main(String[] args) 
	{
		
		ArrayDeque ad=new ArrayDeque();
		ad.add(12);
		ad.addFirst(6);
		ad.addLast(18);
		ad.add(20);
		System.out.println(ad);
	}

}
