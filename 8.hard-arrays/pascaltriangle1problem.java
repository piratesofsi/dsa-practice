import java.util.*;


class Myarray {
	static long ncr(int a, int b) {
		long res = 1;
		for (int i = 0; i < b; i++) {
			res *= (a - i);
			res /= (i + 1);
		}
		return res;
	}
}
public class pascaltriangle1problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of row  : ");
		int n = sc.nextInt();
		System.out.println("Enter the no of coloumn : ");
		int c = sc.nextInt();
		long result = Myarray.ncr(n - 1, c - 1);
		System.out.println("the value in the pascal triangel at " + n + " and " + c + " is " + result);
		sc.close();

	}
}