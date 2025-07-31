import java.util.*;

class MyArray{
	static void printpattern(int n){
		char bh='A';
		
		for(int i=0;i<n;i++){
			for(char ch='A';ch<='A'+i;ch++){
				System.out.print(bh+" ");
				
				
			}
			bh++;
			System.out.println();
		}
	}
}
public class pattern12{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();
	}
}