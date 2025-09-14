import java.util.*;

class MyArray{

	static int tiny(int arr[]){
		int minimum=Integer.MAX_VALUE;
		int index=-1;
        int n=arr.length;
		//if array has no element 
		if(n==0)
			return -1;
		//if array has only one element
		if(n==1)
			return 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<minimum){
				index=i;
				minimum=arr[i];
			}
		}
		return index;
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class findhowmanytimesthearrayshasbeenrotated{
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
		MyArray.printArr(arr_1);
		int result=MyArray.tiny(arr_1);
		System.out.println();
		if(result==-1){
			System.out.println("the array has no element so it cant be rotated ");
		}
		else{
			System.out.println("the array has been rotated for : "+ result);
		}
		sc.close();
	}
}