import java.util.*;

class Myarray {

	static int[] replace(int arr[], int n) {
		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>();

		//take positives and negatives into separate list
		for (int num : arr) {
			if (num >= 0) {
				pos.add(num);
			} else {
				neg.add(num);
			}
		}
		//creaing an array
		int result[] = new int[n];
		int i = 0;
		int p = 0;
		int q = 0;
		//adding alternately each postive negative uk and then until
		//one of em is ended then
		while (p < pos.size() && q < neg.size()) {
			result[i++] = pos.get(p++);
			result[i++] = neg.get(q++);
		}

		//if neg is ended
		while (p < pos.size()) {
			result[i++] = pos.get(p++);
		}
		//if pos is ended
		while (q < neg.size()) {
			result[i++] = neg.get(q++);
		}
		return result;

	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public  class rearrangingarraybysignunequaloptimised {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		Myarray.replace(arr_1, n);
		System.out.println("the rearranged array : ");
		int result[] = Myarray.replace(arr_1, n);
		Myarray.printarr(result);
		sc.close();
	}
}