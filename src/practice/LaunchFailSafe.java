package practice;

import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArrayList;

public class LaunchFailSafe {

	public static void main(String[] args) 
	{
		CopyOnWriteArrayList ll=new CopyOnWriteArrayList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		Iterator itr=ll.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
				ll.add(44);	//concurrent modification
			}
		

	}

}
