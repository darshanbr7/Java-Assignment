// how can we get a character Array from string
import java.util.*;
class text{
	public static void main(String args[]){
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter the String :");
		 String a=input.nextLine();
		 String c=a;
		 System.out.println(a);
		 char[] b=new char[c.length()];
		 System.out.println(b.length);
		 for(int i=0;i<a.length();i++){
			 b[i]=a.charAt(i); 
		 }
		for( char ele:b){
			System.out.println(ele);
		}
	}
}