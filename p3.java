// write a program to chec the number is positive or not
import java.util.*;
class text{
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter the number :");
		 int n= input.nextInt();
		 if(n>0){
			 System.out.println( n +"  is positive  number");
		 }
		 else if(n==0){
			 System.out.println( n +"  is zero number");
		 }
		 else{
			 System.out.println( n +"  is negative number");
		 }
	}
}