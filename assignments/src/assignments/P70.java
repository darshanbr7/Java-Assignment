// write a program to convert linked list to array list
package assignments;

import java.util.ArrayList;
import java.util.LinkedList;

public class P70 {

	public static void main(String[] args) {
		 LinkedList a=new LinkedList();
		 a.add(10);
		 a.add(11);
		 a.add(12);
		 a.add(13);
		 System.out.println(a);
		ArrayList  b=new ArrayList(a);
		// we pass parameter as a linkedList at the time of Creation of ArrayList
		System.out.println(b);
		

	}

}
