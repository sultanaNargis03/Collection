package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LaunchFE {

	public static void main(String[] args) 
	{

		List<Integer> list=Arrays.asList(10,20,30,40,50);
		
		list.forEach(i->System.out.println(i));

	}

}
