/* write a program to print the least number in the three number  */
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
		if(a<b&&a<c){
			System.out.println("least number is "+a);
		}else if(b<a&&b<c){
			System.out.println("least number is "+b);
		}else{
			System.out.println("least number is "+c);
		}
	}
}