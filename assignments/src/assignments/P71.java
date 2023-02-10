//.Write a program to reverse ArrayList in java?
package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class P71 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);

	}

}
