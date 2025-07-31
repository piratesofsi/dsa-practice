import java.util.*;


class Myarray{
	static int isGcf(int n1,int n2){
		int gcd=1;

		for(int i=1;i<=Math.min(n1,n2);i++){
			if(n1%i==0 && n2%i==0){
				gcd=i;
			}
		}
		return gcd;

	}
}



public class Gcforhcf{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two no : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int results=Myarray.isGcf(n1,n2);
		System.out.println("the gcd of the given nos is "+results);
		sc.close();
	}
}