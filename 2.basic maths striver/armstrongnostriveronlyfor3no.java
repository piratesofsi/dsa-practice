import java.util.*;


class Myarray{
	static boolean isArmstrong(int n){
		int originalno=n;
		int sum=0;
		while(n>0){
			int lastdigit=n%10;
			sum=sum+(lastdigit*lastdigit*lastdigit);
			n=n/10;

		}
		if(originalno==sum){
			return true;
		}
		else{
			return false;
		}

	}
}





public class armstrongnostriveronlyfor3no{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n1=sc.nextInt();
		boolean results=Myarray.isArmstrong(n1);
		if(results)
			System.out.println("It is a armstrong no !!!!");
		else
			System.out.println("It is not a armstrong no !!!!");

		sc.close();


	}
}