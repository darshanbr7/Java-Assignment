// How to convert ArrayList to String Array in java ?
package assignments;

import java.util.ArrayList;

public class P52 {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		arr.add(10);
		arr.add(11);
		arr.add(12);
		arr.add(13);
		arr.add(14);
		arr.add(15);
		arr.toString();
		
		   Object[] a=arr.toArray();
		   String b=a.toString();
		   for(Object ele:b) {
			   System.out.println(ele);
		   }
		   System.out.println(b);
	      
		
		

	}

}
