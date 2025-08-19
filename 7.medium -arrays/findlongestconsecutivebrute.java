import java.util.*;
class Myarray {
	static boolean linearsearch(int x, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				return true;
			}
		}
		return false;
	}

	static int maximize(int arr[]) {
		//if an array starts then the first length will be one ;
		int longest = 1;

		if (arr.length == 0) {
			return -1;
		}


		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			int num = arr[i];
			//can't use nested loops as we dont know how many we
			//run to find the x=x+1 and also we have to find
			//at start if we found so we have to start again which
			//is not possible in for loops so use while loop
			//instead and and using linear search as it'll run
			//until there's element present in the array
			while (linearsearch(num, arr) == true) {
				count++;
				num += 1;

			}
			//comparing both the count and longest
			longest = Math.max(count, longest);

		}
		return longest;
	}



	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class findlongestconsecutivebrute {
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
		int result = Myarray.maximize(arr_1);
		System.out.println("the length of the longest consecutive sequence is : " + result);
		sc.close();


	}
}