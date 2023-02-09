// how many ways to find duplicates elements in  an Array  in java.
package assignments;

import java.util.HashSet;

public class P39 {

	public static void main(String[] args) {
		// one approach is inner looping
		System.out.println("using inner looping");
		int[] arr= {1,2,3,4,5,4,3,2,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
		// using hashset method
		System.out.println("using hashSet method");
		int[] arr1= {1,2,3,4,5,4,3,2,1};
		HashSet a=new HashSet();
		for( int ele:arr1) {
			if(!a.add(ele)) {
				System.out.println(ele);
			}
		}
		

	}

}
