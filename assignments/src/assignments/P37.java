// what is the defaul value of Array
/*
  default value of int-Array is 0
  default value of long-Array is 0
  default value of short-Array is 0
  default value of byte-Array is 0
  default value of double-Array is 0.0
  default value of String-Array is Null
  default value of char-Array is Null
  default value of boolean-Array is false
 */
package assignments;

public class P37 {

	public static void main(String[] args) {
		System.out.println(" for integer Array");
		int[] a=new int[10];
		for(int ele:a) {
			System.out.println(ele);
		}
		System.out.println(" for long  Array");
		long[] b=new long[10];
		for(long ele:b) {
			System.out.println(ele);
		}
		System.out.println(" for short  Array");
		short[] c=new short[10];
		for(short ele:c) {
			System.out.println(ele);
		}
		System.out.println(" for Byte  Array");
		byte[] d=new byte[10];
		for(byte ele:d) {
			System.out.println(ele);
		}
		System.out.println(" for double  Array");
		double[] e=new double[10];
		for(double ele:e) {
			System.out.println(ele);
		}
		System.out.println(" for cahr  Array");
		char[] f=new char[10];
		for(char ele:f) {
			System.out.println(ele);
		}
		
		System.out.println(" for String  Array");
		String[] g=new String[10];
		for(String ele:g) {
			System.out.println(ele);
		}
		System.out.println(" for boolean  Array");
		boolean[] h=new boolean[10];
		for(boolean ele:h) {
			System.out.println(ele);
		}

	}

}
