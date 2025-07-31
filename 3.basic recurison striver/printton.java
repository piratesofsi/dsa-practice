import java.util.*;

//recursion : a function or in java method calls itself until a specific 
//is met means a base case 
//in this case we're printing 1 to n numbers not my name 
class Myarray{
	static void print(int i,int n){
		if(i<1)//here's the condition (base case or base condition )

			return;
	    System.out.println(i);
		print(i-1,n);

	}
}




public class printton{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of times you wanna print : ");
		int n=sc.nextInt();
		int i=n;
		Myarray.print(i,n);
		sc.close();


	}

}