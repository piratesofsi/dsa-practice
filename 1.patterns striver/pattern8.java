import java.util.*;

class MyArray{
	static void printpattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			for(int k=0;k<2*(n-i);k++){
				System.out.print("  ");
			}
			for(int j=i;j>0;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
public class pattern8{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of rows : ");
		int rows=sc.nextInt();
		MyArray.printpattern(rows);
		sc.close();
}
}