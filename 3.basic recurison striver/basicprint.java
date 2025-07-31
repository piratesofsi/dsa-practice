import java.util.*;

//recursion : a function or in java method calls itself until a specific 
//is met means a base case 

class Myarray{
	static void print(int i,int n,String n1){
		if(i>n)//here's the condition (base case or base condition )
			return;
	    System.out.println(n1);
		print(i+1,n,n1);

	}
}




public class basicprint{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name : ");
		String st1=sc.nextLine();
		System.out.println("Enter the no of times you wanna print : ");
		int n=sc.nextInt();
		int i=1;
		Myarray.print(i,n,st1);
		sc.close();


	}

}