//.WAP to find out the smallest and largest number in a given Array?
package assignments;

public class P47 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,3,1};
		int largest=a[0];
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}else if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println("largest value is "+ largest);
		System.out.println("smallest value is "+ smallest);

	}

}
