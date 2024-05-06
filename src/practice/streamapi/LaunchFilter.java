package practice.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LaunchFilter 
{

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		list.stream()
		.filter(i->i%5==0)
		
		.forEach(i->System.out.println(i));
		

	}

}
