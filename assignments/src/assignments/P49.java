// write a program to sum the all the values of given array in java
package assignments;

public class P49 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		int sum=0;
		for(int ele:a) {
			sum=sum+ele;
		}
		System.out.println(sum);

	}

}
