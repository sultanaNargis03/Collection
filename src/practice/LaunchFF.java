package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFF {

	public static void main(String[] args) 
	{
		
		List list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		System.out.println("*******************");
		
		/*
		 * concurrent modification
		 */
//		for(int i=0;i<list.size();i++)
//		{
//			System.out.print(list.get(i)+" ");
//			list.add(44);
//		}
		/*
		 * Fail fast
		 */
		
//		Iterator itr=list.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+" ");
//			list.add(44);
//		}
		
		
	}

}
