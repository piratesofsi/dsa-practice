import java.util.*;
class Myarray {
	static void ncr2(int a) {
		int ans = 1;
		System.out.print(ans);
		for (int i = 1; i < a; i++) {
			ans *= ( - i);
			ans /= (i);
			System.out.print(" " + ans);
		}
	}
}
public class pascaltriangle2problemrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of row you want to print : ");
		int n = sc.nextInt();
		System.out.println("the  " + n + " row is ");
		Myarray.ncr2(n);
		sc.close();
	}
}