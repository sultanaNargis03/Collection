package streamApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaunchCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
		
		list.add(20);
		list.add(10);
		list.add(4);
		list.add(44);
		list.add(8);
		
		System.out.println("Unsorted : "+list);
		Collections.sort(list);
		
		System.out.println("Sorted : "+list);
		
		Collections.rotate(list, 1);
		System.out.println(list);
		
		Collections.rotate(list, -1);
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, 44));
		
		

	}

}
