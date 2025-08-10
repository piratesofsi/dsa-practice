import java.util.*;


class Myarray {

	static void cs(int arr[]) {
		int countzero = 0;
		int countone = 0;
		int counttwo = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countzero++;
			}
			if (arr[i] == 1) {
				countone++;
			}
			if (arr[i] == 2) {
				counttwo++;
			}




		}

		for (int i = 0; i < countzero; i++) {
			arr[i] = 0;
		}
		for (int i = countzero; i < countzero + countone; i++) {
			arr[i] = 1;
		}
		for (int i = countzero + countone; i < countzero + countone + counttwo; i++) {
			arr[i] = 2;
		}
	}


	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
public class countsort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter the  " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		Myarray.cs(arr_1);
		System.out.println("sorted array : ");
		Myarray.printarr(arr_1);
		sc.close();
	}
}