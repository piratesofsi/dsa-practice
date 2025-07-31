import java.util.*;

class Myarray{
	static void is(int arr[]){
		for(int i=1;i<arr.length;i++){
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}

	}

	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}




public class insertionsort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements in the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("array entered by the user: ");
		Myarray.printarr(arr_1);
		System.out.println();
		System.out.println("sorted array : ");
		Myarray.is(arr_1);
		Myarray.printarr(arr_1);
		sc.close();

	}
}