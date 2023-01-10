// write a program to chec the number to check 3 digit number or not
import java.util.*;
class text{
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter the number :");
		 int n= input.nextInt();
		 if(n>99){
			 System.out.println( n +"  is a 3 digit number");
		 }else  if(n<1000){
			 System.out.println( n +"  is a 3 digit number");
		 }
		 else{
			 System.out.println( n +" is not a 3 digit number");
		 }
	}
}