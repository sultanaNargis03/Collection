package practice;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFS {

	public static void main(String[] args) 
	{
		/*
		 * Fail safe
		 */
		CopyOnWriteArrayList list3=new CopyOnWriteArrayList();
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		Iterator itr=list3.iterator();
		
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
			list3.add(44);
		}
	}

}
