// .Write a program to print reverse of digits of numbers
import java.util.*;
class text{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("enter the number :");
		int x=input.nextInt();
		int reminder=0;
		
		while(x>0){
			int devider=x%10;
			reminder=reminder*10+devider;
			x=x/10;
		}
		System.out.println("reverse of the number is "+reminder);  
	}
}
