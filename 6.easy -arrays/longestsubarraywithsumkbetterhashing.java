import java.util.*;


class Myarray {
	static int size(int arr[], long target) {
		long sum = 0;
		int maxlen = 0;
		HashMap<Long, Integer> h1 = new HashMap<>();
		//calculate the sum till i
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			//check if sum==k or not if it is update the length
			if (sum == target) {
				maxlen = Math.max(maxlen, i + 1);
			}

			//check if k is already there in hashmap if it is then update and compare
			long rem = sum - target;
			if (h1.containsKey(rem)) {
				int len = i - h1.get(rem);
				maxlen = Math.max(maxlen, len);
			}

			//if it doesnt exist in map then store it with the index
			if (!h1.containsKey(sum)) {
				h1.put(sum, i);

			}


		}
		return maxlen;
	}
	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class longestsubarraywithsumkbetterhashing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Enter the value of k : ");
		int target = sc.nextInt();
		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		int result = Myarray.size(arr_1, target);
		System.out.println("longest subarray with sum k is of length : " + result);
		sc.close();
	}
}