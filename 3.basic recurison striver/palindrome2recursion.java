import java.util.*;


class Myarray{
	static boolean isPalidrome(String s,int i,int n){
		if(i>=(s.length()/2))
			return true;
		if(s.charAt(i)!=s.charAt(n-i-1))
			return false;
		

		return  isPalidrome(s,i+1,n);

	}
}





public class palindrome2recursion{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String st1=sc.nextLine();
		System.out.println("the string entered by the user : ");
		System.out.println(st1);
		int n=st1.length();
		boolean results=Myarray.isPalidrome(st1,0,n);
		System.out.println(results);
		if(results)
			System.out.println("it is a palindrome");
		else
			System.out.println("it is not a palindrome");
		sc.close();
	}
}