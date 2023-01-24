// write java program to limit the array size from the users
import java.util.Scanner;
class text{
	public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter the Size of an array :");
		  int x=input.nextInt();
		  int[] arr=new int[x];
		  System.out.println(arr.length);
	} 
}