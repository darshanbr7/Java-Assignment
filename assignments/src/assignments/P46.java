// what are the different ways to traverse an Array in java
package assignments;

public class P46 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		
		// through for loop
		System.out.println("through for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		// through while loop
		System.out.println("using while loop");
		int i=0;
		while(i<a.length) {
			System.out.println(a[i]);
			i++;
		}
		
		// using do-while loop
		System.out.println("using do-while loop");
		int j=0;
		do {
			System.out.println(a[j]);
			j++;
		}while(j<a.length);
		
		// using for-each loop
		System.out.println("using for each");
		for(int ele:a) {
			System.out.println(ele);
		}
		

	}

}
