import java.util.*;

class MyArray{
	static void printpattern(int n){
		int stars=1;
		for(int i=0;i<n;i++){
			if(i%2==0)
				stars=1;
			else
				stars=0;
			for(int j=0;j<=i;j++){
				System.out.print(stars+" ");
				stars=1-stars;

			}
				
			System.out.println();
		}
	}
}

public class pattern7striverapproach{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();

	}
}