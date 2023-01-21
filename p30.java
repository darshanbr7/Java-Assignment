//Write a program to print the Fibonacci number series up to a given number
import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter the number to get the fibonacci series :");
		 int x=input.nextInt();
		 int a=0;
		 int b=1;
		 int sum=0;
		 System.out.print(a+" "+b);
		 for(int i=1;i<x-2;i++){
			 
			if(sum<=x){
			sum=a+b;
			 a=b;
			 b=sum;
			 System.out.print(" "+sum);
			 }
		 }
	}
}