import java.util.*;



class Myarray{
	static void fibo(int a,int b,int count){
		if(count<=0)
			return;
		System.out.print(a+" ");
		fibo(b,a+b,count-1);


		
	}
}








public class fibonaccioptimised2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n=sc.nextInt();
		System.out.println("fibonaccci series is  : ");
		Myarray.fibo(0,1,n);
		sc.close();

	}
}