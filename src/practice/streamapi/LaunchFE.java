package practice.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LaunchFE {

	public static void main(String[] args) 
	{
		List<Integer> list=new ArrayList<Integer>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(90);
		
	//	list.forEach(i->System.out.print(i+" "));
		
//		Consumer<Integer> con=new Consumer<Integer>()
//				{
//					@Override
//					public void accept(Integer i) {
//						System.out.println(i);
//						
//					}
//				};
		
		Consumer<Integer> con=i-> 
						System.out.println(i);
			
		

	}

}
