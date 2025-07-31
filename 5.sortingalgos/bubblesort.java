import java.util.*;

class Myarray{
	static void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	static void bs(int arr[]){
		int n=arr.length;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
	}
	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}





public class bubblesort{
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
		Myarray.bs(arr_1);
		Myarray.printarr(arr_1);
		sc.close();

	}
}