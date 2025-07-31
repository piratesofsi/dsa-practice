import java.util.*;


class Myarray {
	static boolean isPalidrome(String s){
		s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

		int i=0;
		int j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}
}






public class palindrome1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String st1=sc.nextLine();
		boolean results=Myarray.isPalidrome(st1);
		if(results)
			System.out.println("it is a palidrome ");
		else 
			System.out.println("it is not a palindrome ");

		sc.close();

	}
}