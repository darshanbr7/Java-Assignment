// write a program to convert Array to List
package assignments;

import java.util.ArrayList;
import java.util.Collections;


public class P64 {

	public static void main(String[] args) {
	 int[] a= {10,20,30,40};
	   ArrayList b=new ArrayList();
	   // one method is Iteraton 
	   for(int ele:a) {
		   b.add(ele);
	   }
	   
	   System.out.println(b);
	   
	    ArrayList c=new ArrayList();
	    // another method is Collection .toList method
	    //Collections.toList(c,a);
	    System.out.println(c);

	}

}
