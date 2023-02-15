// write a program to sort HashMap by keys.
package assignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class P87 {

	public static void main(String[] args) {
		 HashMap a=new HashMap();
		 a.put("darshan", 101);
		 a.put("raju", 102);
		 a.put("harshan", 103);
		 System.out.println(a);
		 /*
		 // one method is converting ArrayList
		ArrayList b= new ArrayList(a.keySet());
		Collections.sort(b);
		System.out.println(b);
		*/
		 
		 // another approach is
		 // using tree map to 
		 TreeMap c=new TreeMap(a);
		Iterator d= c.keySet().iterator();
		while(d.hasNext()) {
			System.out.println(d.next());
		}
		 
		
		 
		
		

	}

}
