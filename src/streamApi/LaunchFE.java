package streamApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LaunchFE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// System.out.println(list);

		List<Integer> list2 = Arrays.asList(20, 30, 44, 54);
		// System.out.println(list2);

		/*
		 * for(Integer o:list2) { System.out.println(o); }
		 */
		//Consumer<Integer> cons=i->System.out.println(i);

		
		list2.forEach(i->System.out.println(i));

	}

}
