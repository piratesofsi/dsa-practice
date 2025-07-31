import java.util.*;

class Myarray{
	static void sumOf(int n,int sum){
		if(n<1){
			System.out.println("the summation of n natural no is : "+sum);
			return;
		}
		sumOf(n-1,sum+n);
	}
}




public class sumofnrecursion{
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n=sc.nextInt();
	
	 Myarray.sumOf(n,0);

		sc.close();
	}
}