import java.util.*;
class MyArray{
	static int search(int arr[],int target){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target)
				return i;
		}
		return -1;
	}




	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}

}
public class searchinrotatedsortedarray1brute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Enter the target : ");
		int target=sc.nextInt();
		System.out.println("Array entered by the user : ");
		MyArray.printArr(arr_1);
		int result=MyArray.search(arr_1,target);
		System.out.println();
		if(result==-1){
			System.out.println("the target is not found!!!");
		}
		else {
			System.out.println("the target is found at index : "+ result);
		}
		sc.close();
	}
}