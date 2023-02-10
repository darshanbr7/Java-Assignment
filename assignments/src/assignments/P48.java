// how to reverse an Array
package assignments;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P48 {

	public static void main(String[] args) {
		// one approach is  assigning to the another array.
		int[] a= {1,2,3,4,5};
		int[] b=new int[a.length];
		 int n=a.length;
		 for(int i=0;i<a.length;i++) {
			 b[n - 1] = a[i];
	            n = n - 1;
		 }
		 for(int ele:a) {
			 System.out.println(ele);
		 }
		 for(int ele:b) {
			 System.out.println(ele);
		 }
		
	}

}
