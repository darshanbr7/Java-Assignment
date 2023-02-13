// write a program to check  if an element an exist in HashSet?
// use contain method to check the element present or not in the HashSet.
package assignments;

import java.util.HashSet;

public class P82 {

	public static void main(String[] args) {
		 HashSet a=new HashSet();
		 a.add(10);
		 a.add(11);
		 a.add(12);
		 System.out.println(a);
		 System.out.println(a.contains(10));
		 System.out.println(a.contains(20));

	}

}
