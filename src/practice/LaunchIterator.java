package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LaunchIterator {

	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		list.add("Iterator");
		list.add("Collection");
		list.add(120);
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		
		ListIterator litr=list.listIterator(list.size());
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+" ");
		}
	}

}
