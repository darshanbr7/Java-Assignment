// write a program to traverse (or iterate ) Hashset .
package assignments;

import java.util.HashSet;
import java.util.Iterator;

public class P81 {

	public static void main(String[] args) {
		 HashSet a=new HashSet();
		 a.add(10);
		 a.add(12);
		 a.add("darshan");
		 a.add("mandya");
		 System.out.println(a);
		 
		 // iteration
		 System.out.println("iteration using iterator");
		Iterator b=a.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		
		// iteration using for-each loop
		System.out.println("iteration using for-each loop");
		for( Object ele:a) {
			System.out.println(ele);
		}

	}

}
