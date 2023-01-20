/* write a program to print the decrement/Descending number in the three number  */
import java.util.*;
class text{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("enter the first number :");
		int a=input.nextInt();
		System.out.print("enter the second  number :");
		int b=input.nextInt();
		System.out.print("enter the third number :");
		int c=input.nextInt();
		if(a>=b&&a>=c){
			if(b>=c){
				System.out.println("Descending order of three number is :"+a+" "+b+" "+c);
			}else{
				System.out.println("Descending order of three number is :"+a+" "+c+" "+b);
			}
		}else if(b>=a&&b>=c){
			if(a>=c){
				System.out.println("Descending order of three number is :"+b+" "+a+" "+c);
			}else{
				System.out.println("Descending order of three number is :"+b+" "+c+" "+a);
			}
		}else{
			if(b>=a){
				System.out.println("Descending order of three number is :"+c+" "+b+" "+a);
			}else{
				System.out.println("Descending order of three number is :"+c+" "+a+" "+b);
			}
		}
	}
}