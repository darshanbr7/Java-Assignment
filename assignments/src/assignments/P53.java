//.Write a program to find the second largest element in a given Array in java?
package assignments;

import java.util.Arrays;

public class P53 {

	public static void main(String[] args) {
		// one approach is sorting an Array and print the last second index value
		int[] a={1,2,3,4,5,8,6,7};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			
		}
		System.out.println("second largest value is "+a[a.length-2]);
		
		// another approach is sorting an array and print last second index value
		int[] b= {9,8,7,6,6,5,5,4,3,2};
		Arrays.sort(b);
		System.out.println(b[b.length-2]);
		

	}

}
