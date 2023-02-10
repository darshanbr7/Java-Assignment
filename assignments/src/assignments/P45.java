// how to find the duplicate element in Array
// using inner loops to find the duplicates element
package assignments;

public class P45 {

	public static void main(String[] args) {
	// using inner loops
		int[] a= {1,2,3,4,5,4,3,2,1,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}

	}

}
