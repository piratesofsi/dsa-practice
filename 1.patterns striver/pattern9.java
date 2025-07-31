import java.util.*;

class MyArray{
	static void printpattern(int n){
		int start=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(start+" ");
				start++;
			}
			System.out.println();
		}
	}
}
public class pattern9{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();
	}
}