import java.util.*;

class Myarray{
	static void print(int i,int n){
		if(i>n)
			return;
		print(i+1,n);
		System.out.println(i);
	}
}




public class basicprintbacktracking{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of times you wanna print: ");
		int n=sc.nextInt();
		int i=1;
		Myarray.print(i,n);
		sc.close();
	}
}