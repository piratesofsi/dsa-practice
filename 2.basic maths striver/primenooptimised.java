import java.util.*;


class Myarray{
	static boolean isPrime(int n){
		int count=0;
		if(n==2){
			System.out.println("It is a even prime no");
			return true;
		}



		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0){
				count++;

				if((n/i)!=i){
					count++;
				}
			}
		}

		if(count==2)
		{
			return true;
		}
		return false;

	}
}
public class primenooptimised{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n1=sc.nextInt();
		boolean results=Myarray.isPrime(n1);
		if(results)
			System.out.println("Prime no ");
		else
			System.out.println("not a Prime no !!!");

		sc.close();

	}
}