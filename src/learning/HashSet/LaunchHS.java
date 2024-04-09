package learning.HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LaunchHS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		
		hs.add("java");
		hs.add(20);
		hs.add(30);
	//	hs.add(30);
		hs.add(50);
		hs.add(4);
		hs.add(44);
		System.out.println(hs);
		System.out.println(hs.contains(50));
		
		LinkedHashSet hs1=new LinkedHashSet();
		
		hs1.add("java");
		hs1.add(20);
		hs1.add(30);
	//	hs.add(30);
		hs1.add(50);
		hs1.add(4);
		hs1.add(44);
		System.out.println(hs1);
		//System.out.println(hs.contains(50));

	}

}
