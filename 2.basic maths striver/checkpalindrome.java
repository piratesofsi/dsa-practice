import java.util.*;

class MyArray{
	static boolean reverseOf(int n){
		int originalno=n;
		int revno=0;
		while(n>0){
			int lastdigit=n%10;
			  n=n/10;

			   revno=(revno*10)+lastdigit;

		}
		if(revno==originalno)
			return true;
		else 
			return false;
		

	}
}



public class checkpalindrome{
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the no : ");
	     int n1=sc.nextInt();
	     boolean result=MyArray.reverseOf(n1);
	     if(result)
	     	System.out.println("It is a palindrome!!!!!");
	     else
	     	System.out.println("It is not a palindrome!!!!1");
	     
	    
	     sc.close();

	}
}