import java.util.*;



class Myarray{
	static int isGcf(int a,int b){
		while(a>0 && b>0){
			if(a>b)
			a=a%b;
		
		else
			b=b%a;
	}  
		if(a==0)
			return b;
		else 
			return a;
	}
}




public class Gcdorhcfoptimised{
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