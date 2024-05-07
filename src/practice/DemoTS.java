package practice;

import java.util.TreeSet;

public class DemoTS {

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(150);
		ts.add(25);
		ts.add(250);
		ts.add(125);
		ts.add(75);
		//ts.add("");	//null not allowed
		//ts.add(40); //duplicates not allowed
		System.out.println(ts);
		System.out.println(ts.ceiling(150));	//150
		System.out.println(ts.ceiling(35));		//40
		System.out.println("**********************");
		System.out.println(ts.higher(150));		//250
		System.out.println(ts.higher(35));		//40
		System.out.println("**********************");
		System.out.println(ts.floor(150));		//150
		System.out.println(ts.floor(35));		//30
		System.out.println("**********************");
		System.out.println(ts.lower(150));		//125
		System.out.println(ts.lower(35));		//30

	}

}
