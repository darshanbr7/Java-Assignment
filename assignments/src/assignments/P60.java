// write a program to sort an Array
package assignments;

import java.util.Arrays;

public class P60 {

	public static void main(String[] args) {
	 int[] a= {-1,5,4,3,2,1};
	  System.out.println("before sorting");
	  for( int ele:a) {
		  System.out.println(ele);
	  }
	  System.out.println("after sorting");
	  Arrays.sort(a);
	  for( int ele:a) {
		  System.out.println(ele);
	  }
	  
	  System.out.println("using inner looping");
	  int[] b= {-1,5,4,3,2,1};
	  int temp=0;
	  for(int i=0;i<b.length;i++) {
		  for(int j=i+1;j<b.length;j++) {
			  if(b[i]>b[j]) {
				  temp=b[i];
				  b[i]=b[j];
				  b[j]=temp;
			  }
		  }
	  }
	  for(int ele:b) {
		  System.out.println(ele);
	  }
	  

	}

}
