import java.util.*;

class MyArray{
	static void printpattern(int n){
		for(int i=0;i<n;i++){
			
			for(int j=0;j<=i;j++){
				char ch=(char)('A'+i);
				System.out.print(ch+" ");
			}
			System.out.println();
		}
	}
}
public class pattern12my{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();

	}
}