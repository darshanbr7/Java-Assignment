//  write a ajava program to print first 5 values which are divisable by 2 3 and 5
class text{
	public static void main (String args[]){
		for(int i=1;i<=150;i++){
			if(i%5==0&&i%3==0){
				if(i%2==0){
					System.out.println(i);
				}
			}
		}
	}
}