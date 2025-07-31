import java.util.*;


class Myarray{

	static void swap(int i ,int j,int arr[]){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	static void reverse(int arr[]){
		int i=0;
		int j=arr.length-1;
		while(i<j){
			swap(i,j,arr);
			i++;
			j--;

		}
	}




	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}





public class reversearray1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+"number of elements in the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		System.out.println("Reversed array: ");
		Myarray.reverse(arr_1);
		Myarray.printarr(arr_1);
		sc.close();

	}
}