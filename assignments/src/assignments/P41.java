//write a program to check whether the two given Arrays are equal given both contain the same data type and same length 
package assignments;

import java.util.Arrays;

public class P41 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {1,2,3,4,5,0};
		
		// some default method is Equals 
		Arrays.equals(a, b);
		System.out.println(Arrays.equals(a, b));
	}

}
