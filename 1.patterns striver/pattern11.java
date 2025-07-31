import java.util.*;

class MyArray{
	static void printpattern(int n ){
		for(int i=0;i<n;i++){
			for(char ch='A';ch<='A'+(n-i-1);ch++){
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
public class pattern11{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();

	}
}