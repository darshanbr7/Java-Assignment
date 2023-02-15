// write a program to sort Hashmap by value

package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class P89 {

	public static void main(String[] args) {
		 HashMap a=new HashMap();
		 a.put(1, "raju");
		 a.put(2,"jayanthi");
		 a.put(3, "darshan");
		 a.put(4, "harshan");
		 System.out.println(a);
		 
		 // one approach is converting it into arraylist and later short it
		 ArrayList b=new ArrayList(a.values());
		 Collections.sort(b);
		 System.out.println(b);

	}

}
