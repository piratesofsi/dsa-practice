import java.util.*;

class MyArray{
	static void printpattern(int n){
		for(int i=0;i<n;i++){
			//space
			for(int j=0;j<n-i-1;j++){
				System.out.print("  ");

			}

			//star
			for(int k=0;k<(2*i+1);k++){
				System.out.print("* ");
			}

			//space
			for(int j=0;j<n-i-1;j++){
				System.out.print("  ");

			}
			System.out.println();


		}

		//second 
		for(int i=0;i<n;i++){
			//space
			for(int j=0;j<i;j++){
				System.out.print("  ");
			}

			//star
			for(int k=0;k<2*n-(2*i+1);k++){
				System.out.print("* ");
			}

			//space
			for(int j=0;j<i;j++){
				System.out.print("  ");
			}
			System.out.println();
		}
	}
}
public class mixfull12{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();
	}
}