package practice;


import java.util.LinkedHashSet;

public class DemoLinkedHashSet {

	public static void main(String[] args) 
	{
		LinkedHashSet lhs= new LinkedHashSet();
		
		lhs.add(10);
		lhs.add(60.8);
		lhs.add(101);
		lhs.add(50);
		lhs.add("Java");
		//lhs.add(60.8); //duplicate not allowed
		lhs.add("");	//null value allowed
		lhs.add("Linked Hash Set");
		System.out.println(lhs);	//order of insertion is retained
	}

}
