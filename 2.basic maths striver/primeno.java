import java.util.*;



class Myarray{
	static boolean isPrime(int n){
		int count=0;
		if(n==2)
			System.out.println("It is also a even-prime no !!!");
		for(int i=1;i<=n;i++){
			if(n%i==0)
				count++;

		}
		if(count==2){
			return true;
		}
		return false;
	}
}





public class primeno{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n1=sc.nextInt();
		boolean results = Myarray.isPrime(n1);
		if(results){
			System.out.println("It is a prime no !!!");
		}
		else {
			System.out.println("It is not a prime no !!!!");
		}
		sc.close();
	}
}