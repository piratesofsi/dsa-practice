import java.util.*;

class MyArray{
	static int reverseOf(int n){
		int revno=0;
		while(n>0){
			int lastdigit=n%10;
			  n=n/10;

			   revno=(revno*10)+lastdigit;

		}
		return revno;

	}
}



public class reverseno{
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the no : ");
	     int n1=sc.nextInt();
	     int result=MyArray.reverseOf(n1);
	     System.out.println("the reverse of the given no is : "+result);
	     sc.close();

	}
}