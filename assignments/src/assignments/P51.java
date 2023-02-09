// how to convert Array to ArrayList
package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P51 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		List<int[]> arr=Arrays.asList(a);
		System.out.println(arr);
		 ArrayList b=new ArrayList();
		 for(int i=0;i<a.length;i++) {
			 b[i]=a[i];
		 }
	}

}
