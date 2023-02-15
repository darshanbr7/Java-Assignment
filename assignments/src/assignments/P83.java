// write a program to convert HashSet to array.
/* 
  HashSet is converted into Array using ToArray() method.
 */
package assignments;

import java.util.HashSet;

public class P83 {

	public static void main(String[] args) {
		 HashSet a=new HashSet();
		 a.add(10);
		 a.add(11);
		 a.add(12);
		 System.out.println(a);
		 Object[] b=a.toArray();
		 System.out.println(b);
		 for(Object ele:b) {
			 System.out.println(ele);
		 }

	}

}
