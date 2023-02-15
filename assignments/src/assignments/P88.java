// write a  program to iterate a TreeMap in java
package assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class P88 {

	public static void main(String[] args) {
		 TreeMap a=new TreeMap();
		 a.put(101,"darshan");
		 a.put(102,"harshan");
		 a.put(103,"raju");
		 System.out.println(a);
		 Iterator  b= a.entrySet().iterator();
		 while(b.hasNext()) {
			 System.out.println(b.next());
		 }
		 
		ArrayList c= new ArrayList(a.keySet());
		for(Object keys:c) {
			System.out.println(keys +" : "+a.get(keys));
		}

	}

}
