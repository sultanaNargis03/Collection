package practice;

import java.util.LinkedHashSet;

public class LaunchLinkedHashSet {

	public static void main(String[] args) 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(100);
		lhs.add("Java");
		lhs.add(30);
		lhs.add(40);
		lhs.add(10);
//		lhs.add(10);
		lhs.add("");
		System.out.println(lhs);

	}

}
