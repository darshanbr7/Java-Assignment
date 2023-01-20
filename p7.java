/* write a program to peint a least number in given two numbers.  */
import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		 System.out.print("enter the number :");
		 int x=input.nextInt();
		 if(x%2==0){
			 System.out.println(x +" is even number");
		 }
		 else{
			 System.out.println(x +" is odd number");
		 }
	}
}