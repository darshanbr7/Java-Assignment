//How to synchronize an ArrayList in java?
package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P73 {

	public static void main(String[] args) {
		List a= new ArrayList();
		a.add(10);
		a.add(11);
		a.add(12);
		System.out.println(a);
		Collections.synchronizedList(a);
		System.out.println(a);
		

	}

}
