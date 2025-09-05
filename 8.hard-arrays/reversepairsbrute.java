import java.util.*;

class Myarray{

	static int reversePairs(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>2*arr[j]){
					count++;
				}
			}
		}
		return count;
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}



public class reversepairsbrute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}
		System.out.println("Array entered by the user : ");
		Myarray.printArr(arr_1);
		System.out.println();
		int result=Myarray.reversePairs(arr_1);
		System.out.println("no of reverse pairs in the array are : "+ result);

		sc.close();
	}
}