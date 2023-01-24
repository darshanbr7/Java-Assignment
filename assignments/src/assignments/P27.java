// write a program to print the factors of the given number
package assignments;
import java.util.Scanner;

public class P27 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number :");
		int a=input.nextInt();
				for(int i=1;i<=a;i++) {
					if(a%i==0) {
						System.out.println(i);
					}
				}

	}

}
