//.How to check if Array contains the desired value or not ?
package assignments;

public class P54 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int b=5;
		for(int ele:a) {
			if(b==ele) {
				System.out.println("it contains");
			} else {
				System.out.println("not contains");
			}
		}

	}

}
