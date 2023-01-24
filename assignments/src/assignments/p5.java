// write a program to chec the number even or odd
import java.util.*;
class text{
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter the number :");
		 int n= input.nextInt();
		 if(n%2==0){
			 System.out.println( n +" is a  even number");
		 }
		 else{
			 System.out.println( n +" is a odd number");
		 }
	}
}