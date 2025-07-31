import java.util.*;


class Myarray{
	static int  printsum(int n){
	    int sum=0;
	    for(int i=1;i<=n;i++){
	    	sum+=i;
	    }
	    return sum;
	}
}




public class sumofn{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the no : ");
	    int n=sc.nextInt();
	   int results = Myarray.printsum(n);
	   System.out.println("the summation of the n natural no is : "+results);
	    sc.close();
	}
}