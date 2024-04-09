import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FFFS {

	public static void main(String[] args)
	{
		ArrayList  list=new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

//		for(int i=0;i<list.size();i++)
//		{
//			list.add(44);
//			System.out.println(list.get(i));
//			
//		}
		
//		Iterator itr=list.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//			list.add(44);
//		}
		
//		ListIterator litr=list.listIterator(list.size());
//		while(litr.hasPrevious())
//		{
//			System.out.println(litr.previous());
//			//list.add(44);
//		}
		
		
		CopyOnWriteArrayList list3=new CopyOnWriteArrayList();
		
		
		
		list3.add(10);
		list3.add(20);
		list3.add(30);
		list3.add(40);
		Iterator itr=list3.iterator();
		while(itr.hasNext())
			{
				System.out.println(itr.next());
				list3.add(44);
			}
		
		
		
		
		
	}

}
