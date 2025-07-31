import java.util.*;

class Myarray{
	static void allprint(int n){
		for(int i=1;i<=n;i++){
			if(n%i==0)
				System.out.print(" "+i);
		}
	}
}
public class printalldivisors{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n1=sc.nextInt();
		System.out.println("the no which can be divisible by "+n1+ " are :");
		Myarray.allprint(n1);
		sc.close();

	}
}