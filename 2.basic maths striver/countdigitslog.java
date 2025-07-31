import java.util.*;
//use math.log10 function to use log10 in java 
class MyArray{
	static int  noofdigits(int n){
		int count=(int)(Math.log10(n)+1);
		
		return count;

	}
}



public class countdigitslog{
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number  : ");
	int n1=sc.nextInt();
	int results = MyArray.noofdigits(n1);
	System.out.println(" no of digits are : "+results);
	sc.close();

   }
}