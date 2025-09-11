import java.util.*;


class MyArray{

	static int[] find(int arr[],int target){
         int first=-1,last=-1;
         for(int i=0;i<arr.length;i++){
         	if(arr[i]==target && first==-1){
                first=i;
         	}
         	if(arr[i]==target)
         		last=i;
         }
         return new int[]{first,last};
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class firstandlastpositionbrute{
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
		System.out.println();
		System.out.println("Array entered by the user : ");
		MyArray.printArr(arr_1);
		int result[]=MyArray.find(arr_1,target);
		System.out.println();
		System.out.println("the start index and ending index is : ");
		MyArray.printArr(result);
		sc.close();
	}
}