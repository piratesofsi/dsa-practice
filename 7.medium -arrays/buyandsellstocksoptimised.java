import java.util.*;

class Myarray {

	static int stocks(int arr[]) {
		int maxprofit = 0;
		int bestbuy = arr[0];
		for (int i = 1; i < arr.length; i++) {

			//first track the bestbuy for means the minimum price to buy as
			//we're taking the i as the selling day so usse pehle sb buyin days

			bestbuy = Math.min(bestbuy, arr[i]);

			//now we're calculating maximum profit as we got best buy means selling price
			//for current day so uk selling price -buying price for profit
			maxprofit = Math.max(maxprofit, arr[i] - bestbuy);

		}

		return maxprofit;
	}


	static void printarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
	}
}




public class buyandsellstocksoptimised {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr_1[] = new int[n];
		System.out.println("Enter " + n + " elements of the array : ");
		for (int i = 0; i < arr_1.length; i++) {
			arr_1[i] = sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		int result = Myarray.stocks(arr_1);
		System.out.println();
		System.out.println("the maxium profit can be attained is : " + result);
		sc.close();
	}
}