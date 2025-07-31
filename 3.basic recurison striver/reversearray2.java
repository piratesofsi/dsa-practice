import java.util.*;


class Myarray{
	static void swap(int i,int j,int arr[]){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	static void reverse(int l, int r ,int arr[]){
		if(l>=r)
			return;
		swap(l,r,arr);
		 reverse(l+1,r-1,arr);

	}









	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}






public class reversearray2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+"elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		Myarray.reverse(0,n-1,arr_1);
		System.out.println("Reversed array : ");
		Myarray.printarr(arr_1);
		sc.close();

	}
}