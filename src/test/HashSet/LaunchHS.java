package test.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHS {

	public static void main(String[] args) 
	{
		HashSet hs =new HashSet();
		
		hs.add(10);
		hs.add(30);
		hs.add(4);
		hs.add("java");
		hs.add(90);
		hs.add(89);
		
		System.out.println(hs);
		
		
		LinkedHashSet hs2 =new LinkedHashSet();
		
		hs2.add(10);
		hs2.add(30);
		hs2.add(4);
		hs2.add("java");
		hs2.add(90);
		hs2.add(89);

		System.out.println(hs2);

	}

}
