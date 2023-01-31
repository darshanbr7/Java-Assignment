//write a program to read 5 numbers print only even numbers
package assignments;

import java.util.Scanner;

public class P29 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=5;i++) {
			System.out.print("enter the number: ");
			int a=input.nextInt();
			if(a%2==0) {
				System.out.println(a);
			}
			
		}
		
			
	}

}
