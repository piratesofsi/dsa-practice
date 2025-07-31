import java.util.*;


class MyArray{
	static void printpattern(int n ){
		for(int i=0;i<=2*n-1;i++){
			int stars=i;
			if(i>n)
			  stars=2*n-i;
			for(int j=0;j<stars;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}




public class halftrianglesymetry{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();


	}
}