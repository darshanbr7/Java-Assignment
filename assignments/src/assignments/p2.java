// write a program to chec the number id divisable by 3 or not
import java.util.*;
class text{
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter the number :");
		 int n= input.nextInt();
		 if(n%3==0){
			 System.out.println( n +"  is  the multiple of 3");
		 }
		 else{
			 System.out.println( n +"  is not multiple of 3");
		 }
	}
}