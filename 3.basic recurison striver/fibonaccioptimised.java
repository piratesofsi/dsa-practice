import java.util.*;


class Myarray{
	static int fibo(int n){
		if(n<=1)
			return n ;
		return fibo(n-1)+fibo(n-2);

	}
}






public class fibonaccioptimised{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n=sc.nextInt();
		System.out.println("fibo end with : ");
		int results=Myarray.fibo(n);
		System.out.println(results);
		sc.close();

	}
}