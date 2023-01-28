// write a program to check the if the elemnet is present in the ArrayList
package assignments;

import java.util.ArrayList;

public class P62 {
	
	
	public static void main(String[] args) {
		   ArrayList a=new ArrayList();
		   a.add(10);
		   a.add(20);
		   a.add(30);
		   a.add(40);
		   System.out.println(a);
		   // to check the ArrYlis Contain the elemnet Or not
		     System.out.println(a.contains(10));
		     // if the element is present it returns true
		     System.out.println(a.contains(90));
		  // if the element is present it returns true
		
	}

}
