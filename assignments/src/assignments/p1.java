// write a program to chec the number id divisable by 7 or not
import java.util.*;
class text{
	public static void main(String[] args){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter the number :");
		 int n= input.nextInt();
		 if(n%7==0){
			 System.out.println( n +"  is divided by 7");
		 }
		 else{
			 System.out.println( n +"  is not  divided by 7");
		 }
	}
}