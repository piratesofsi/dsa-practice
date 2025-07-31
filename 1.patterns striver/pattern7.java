import java.util.*;

class MyArray{
	static void printpattern(int n){
		int stars=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				
				if(i%2==0){
					System.out.print(stars );
					stars=1-stars;
				}
				 
				else{
					stars=1-stars;
					System.out.print(stars);
					
				}

				
			}
			stars=1;
			System.out.println();
		}
	}
}

public class pattern7{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();

	}
}