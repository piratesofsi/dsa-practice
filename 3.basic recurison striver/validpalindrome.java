import java.util.*;



class Myarray{
	static boolean isPalidrome(int i,String s){
           int n=s.length();
		if(i>=(n/2))
			return true;
		if(s.charAt(i)!=s.charAt(n-i-1))
			return false;

		return isPalidrome(i+1,s);

	}
}




 
public class validpalindrome{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string : ");
		String st1=sc.nextLine();
		boolean results=Myarray.isPalidrome(0,st1);
		if(results)
			System.out.println("it is a palindrome");
		else 
			System.out.println("it is not palindrome");
		sc.close();

	}
}