package learning.TreeSet;

import java.util.TreeSet;

public class LaunchTreeSet 
{
     public static void main(String[] args) 
     {
		TreeSet set=new TreeSet();
		set.add(50);
		set.add(100);
		set.add(150);
		set.add(25);
		set.add(75);
		set.add(125);
		set.add(175);
		//set.add(175);
		
		System.out.println(set);
		System.out.println("**************************");
		
		System.out.println(set.ceiling(140));//150
		System.out.println(set.higher(140));//150
		
		System.out.println(set.ceiling(150));//150
		System.out.println(set.higher(150));//175
		
		System.out.println(set.floor(150));//150
		System.out.println(set.floor(140));//125
		
		System.out.println(set.lower(150));//125
		
		System.out.println(set.headSet(100));
		System.out.println(set.tailSet(100));
     }
}
