// what are the types of array
package assignments;

public class P34 {

	public static void main(String[] args) {
		 // there are two types of array
		// single dymention Array
		int[] a= {1,2,3,4,5};
		
		// multi dymentional Array
		int[][] b= {{1,2,3},{1,2,3}};
		// iteration of multidirectional array
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.println(a[i]+" "+a[j]); 
			}
		}
		

	}

}
