// write program  to taverse or iterate ArrayList;
package assignments;

import java.util.ArrayList;
import java.util.Iterator;

public class P61 {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		System.out.println(a);
		
		// iteration through for Each loop
		for ( Object ele:a ) {
			System.out.println(ele);
		}
		
		// iteration through the Iterator
		Iterator b=a.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
	}

}
