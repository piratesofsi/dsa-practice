import java.util.*;

class MyArray{
	static void printpattern(int n){
		for(int i=0;i<n;i++){
			int breakpoint=(2*i+1)/2;
			for(int j=0;j<n-i-1;j++){
				System.out.print("  ");
			}
			 char ch='A';
			for(int k=0;k<2*i+1;k++){
				System.out.print(ch+" ");
				if(k<breakpoint){
				
				ch++;
			  }
			  else{
			  	ch--;

			  }
			}
			System.out.println();
		}
	}
}




public class fulltrianglewords{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();

	}
}