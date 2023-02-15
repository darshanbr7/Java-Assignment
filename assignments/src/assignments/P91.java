// how to synchronize a hashmap in java

package assignments;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class P91 {

	public static void main(String[] args) {
	   HashMap a =	new HashMap();
	   a.put(101, "darshan");
	   a.put(102, "harshan");
	   a.put(103, "raju");
	   a.put(104, "jaynthi");
	   System.out.println(a);
	   
	   // synchronization is done by using synchronizedMap method Collections package
	   Map b=Collections.synchronizedMap(a);
	   System.out.println(b);

	}

}
