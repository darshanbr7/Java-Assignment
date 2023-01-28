//write a program to sort ArrayList in descendig order
package assignments;

import java.util.ArrayList;
import java.util.Collections;

public class P67 {

	public static void main(String[] args) {
      ArrayList a= new ArrayList();
      a.add(10);
      a.add(90);
      a.add(8);
      a.add(70);
      System.out.println(a);
      Collections.sort(a);
      Collections.reverse(a);
      System.out.println("in reverse order: "+a);
	}

}
