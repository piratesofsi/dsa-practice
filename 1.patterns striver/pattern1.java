import java.util.*;
public class pattern1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of the rows: ");
		int rows=sc.nextInt();
		for(int i=0;i<rows;i++){
			for(int j=0;j<rows;j++){
				System.out.print(" *");
			}
			System.out.println();
		}
		sc.close();
	}
}