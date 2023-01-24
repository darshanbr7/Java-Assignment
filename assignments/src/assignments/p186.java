// how to check the String is palindrome or not
//String to StringBuffer using append() method
//StringBuffer to String using toString() method
import java.util.*;
class text{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("ehter the String :");
		 String a=input.nextLine();
		 char ch;
		 String rev="";
		 for(int i=0;i<a.length();i++){
			 ch=a.charAt(i);
			 rev=ch+rev;
		 }
		 System.out.println("reverse of string is : "+rev);
		ch c=new ch[a.length()];
		for(int i=0;i<a.length();i++){
			c[i]=a.charAt(i);
		}
		ch d=new ch[rev.length()];
		for(int i=0;i<rev.length();i++){
			d[i]=rev.charAt(i);
		}
		for(int i=0;i<a.length();i++){
			if(c[i]==rev[i]){
				System.out.println("is a palendrome");
			}
		}
	}
	
}