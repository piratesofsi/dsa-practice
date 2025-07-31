import java.util.*;



class Myarray{
	static int sumOf(int n){
		int sum=0;
		if(n==1)
			return 1;

		return sum=n+sumOf(n-1);
	}
}




public class sumofnfunction{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n=sc.nextInt();
	    int results=Myarray.sumOf(n);
	    System.out.println("the summation of the n natural no is : "+results);
	    sc.close();

	}
}