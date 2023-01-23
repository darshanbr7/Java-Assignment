// how to reverse a string;
import java.util.*;
class text{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the String :");
		String a=input.nextLine();
		String rev="";
		char ch;
		for(int i=0;i<a.length();i++){
			ch=a.charAt(i);
			rev=ch+rev;
		}
		System.out.println("reverse string is "+rev); 
	}
}