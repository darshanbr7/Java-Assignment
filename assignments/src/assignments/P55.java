//Write a program to find the first repeating number in an integer Array?
package assignments;

import java.util.HashSet;

public class P55 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,3,1};
		HashSet b=new HashSet();
		int firstrepeat=-1;
		for(int i=a.length-1;i>=0;i--) {
			if(b.contains(a[i])) {
				firstrepeat=a[i];
			}else {
				b.add(a[i]);
			}
		}
		System.out.println(" first repeat value is "+firstrepeat);

	}

}
