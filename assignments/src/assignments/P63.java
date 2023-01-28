// write a program to convert list to Array
package assignments;

import java.util.ArrayList;

public class P63 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		// to Array method is used to convert ArrayList to Array
		Object[] b=a.toArray();
		System.out.println(b);
		for (Object ele:b) {
			System.out.println(ele);
		}
		
	}

}
