import java.util.*;
class Myarray {
	static ArrayList<Integer> ncr2(int a) {
		int ans = 1;
		ArrayList<Integer> list = new ArrayList<>();
		list.add(ans);
		for (int i = 1; i < a; i++) {
			ans *= (a - i);
			ans /= (i);
			list.add(ans);
		}
		return list;
	}


	static ArrayList<ArrayList<Integer>> whole(int b) {
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
		for (int i = 1; i <= b; i++) {
			list2.add(ncr2(i));


		}
		return list2;
	}
}
public class pascaltriangle3whole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of row you want to print : ");
		int n = sc.nextInt();
		System.out.println("the  " + n + " row is ");
		ArrayList<ArrayList<Integer>> result = Myarray.whole(n);
		for (ArrayList<Integer> row : result) {
			System.out.println(row);
		}
		sc.close();
	}
}