package practice;

import java.util.ArrayList;
import java.util.Collections;

public class LaunchCollection 
{
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("after sorting \n"+list);
//		Collections.shuffle(list);
//		System.out.println("after shuffle \n"+list);
		Collections.rotate(list, -1);
		System.out.println("after rotation\n"+list);
		
	}
}
