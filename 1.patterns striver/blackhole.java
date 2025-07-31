import java.util.*;


class MyArray{
	static void printpattern(int n){
		for(int i=0;i<n;i++){
			//stars 
			for(int j=0;j<n-i;j++){
				System.out.print("* ");
			}

			//spaces 
			for(int k=0;k<2*i;k++){
				System.out.print("  ");
			}

			//stars
			for(int j=0;j<n-i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		//part2
		for(int i=0;i<n;i++){
			//stars 
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}

			//spaces 
			for(int k=0;k<2*(n-i-1);k++){
				System.out.print("  ");
			}

			//stars
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}




	}
}


public class blackhole{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();

	}
}