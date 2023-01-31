// write a program to check given numbers is an Armstrong number or not
package assignments;

import java.util.Scanner;

public class P31 {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter the number :");
		 int a=input.nextInt();
		 int sum=0;
		 int b=a;
		 while(a>0) {
			 int reminder=a%10;
			 sum=reminder*reminder*reminder+sum;
			 a=a/10;
			 
		 }
		 
		 if(b==sum) {
			 System.out.println(b+" is a Aramstrong Number");
		 }else {
			 System.out.println(b+" is a not Aramstrong Number");
		 }
	}

}
