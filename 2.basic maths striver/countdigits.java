import java.util.*;

class MyArray{
	static int  noofdigits(int n){
		int count=0;
		while(n>0){
			int lastdigit=n%10;
			count++;
			n=n/10;
		}
		return count;

	}
}



public class countdigits{
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number  : ");
	int n1=sc.nextInt();
	int results = MyArray.noofdigits(n1);
	System.out.println(" no of digits are : "+results);
	sc.close();

   }
}