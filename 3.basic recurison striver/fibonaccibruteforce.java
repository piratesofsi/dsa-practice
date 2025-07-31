import java.util.*;



class Myarray{
	static void fibo(int n){
		int fibo[]=new int[n+1];
	   fibo[0]=0;
	   if(n>=1){
	   	fibo[1]=1;
	   }

		for(int i=2;i<=n;i++){
			fibo[i]=fibo[i-1]+fibo[i-2];
		}

		//printing array:
		     for(int i=0;i<fibo.length;i++){
		     	System.out.print(" "+fibo[i]);
		     }
		

	}

}







public class fibonaccibruteforce{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size or till when : ");
		int n=sc.nextInt();
		System.out.println("the fibonacciseries is : ");
		Myarray.fibo(n);
		sc.close();

	}
}