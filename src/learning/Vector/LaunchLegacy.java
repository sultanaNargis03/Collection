package learning.Vector;

import java.util.Enumeration;
import java.util.Vector;

public class LaunchLegacy 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(10);
		v.add(30);
		v.add(20);
		v.add(50);
		
		Enumeration elem=v.elements();
		
		while(elem.hasMoreElements())
		{
			System.out.println(elem.nextElement());
		}
		
		
	}

}
