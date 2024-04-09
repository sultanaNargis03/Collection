package practice;

import java.util.TreeSet;

public class LaunchTreeSet {

	public static void main(String[] args) 
	{
		TreeSet set =new TreeSet();
		
		//skewed tree
//		set.add(10);
//		set.add(20);
//		set.add(30);
//		set.add(40);
		
		//balanced tree -LRR
		set.add(100);
		set.add(50);
		set.add(150);
		set.add(25);
		set.add(75);
		set.add(125);
//		duplicate not allowed
//		set.add(125);
//		null not allowed
//		set.add("");
		set.add(175);
		
		System.out.println(set);
		
		System.out.println("**********	ceiling	******************");
		System.out.println(set.ceiling(150));	//150
		System.out.println(set.ceiling(140));	//150
		
		System.out.println("***********	higher	**************");
		
		System.out.println(set.higher(150));	//175
		System.out.println(set.higher(140));	//150
		
		System.out.println("**********	floor	******************");
		System.out.println(set.floor(150));	//150
		System.out.println(set.floor(140));	//125
		
		System.out.println("***********	lower	**************");
		
		System.out.println(set.lower(150));	//125
		System.out.println(set.lower(140));	//125
		
		
		System.out.println(set.headSet(125));
		System.out.println(set.tailSet(125));

	}

}
