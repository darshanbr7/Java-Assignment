// how to copy an Array
package assignments;

import java.util.Arrays;

public class P36 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		System.out.println(a);
		int[] b=new int[a.length];
		
		// copyOf method 
		/* it is  belongs to Arrays package 
		 it contain two parameters 1.source Array , ArraySize
		 */
		System.out.println("using the copyOf method");
		b=Arrays.copyOf(a,a.length);
		for( int ele:b) {
			System.out.println(ele);
		}
		
		/*
		 copyOfRange   it is another method to copy an Array
		 it contain three parameter  1.source Array  2.from index   3.lastIndex
		 */
		System.out.println("using the .copyOfRange method");
		int[] c=new int[a.length];
		c=Arrays.copyOfRange(a, 0, a.length);
		for(int ele:c) {
			System.out.println(ele);
		}
		
		System.out.println("using the clone method");
		 int[] d=new int[a.length];
		 d=a.clone();
		 for(int ele:d) {
			 System.out.println(ele);
		 }

	}

}
