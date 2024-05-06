package test.ArrayDequeue;

import java.util.ArrayDeque;

public class LaunchAD 
{
	public static void main(String[] args) 
	{
	
		ArrayDeque ad=new ArrayDeque();
		ad.add(12);
		ad.add("java");
		ad.add(30.5f);
		ad.add(12);
//		ad.remove();
//		ad.removeLast();
//		ad.remove();
		System.out.println(ad);
		
	}
}
