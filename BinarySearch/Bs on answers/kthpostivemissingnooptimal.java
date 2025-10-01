import java.util.*;

class MyArray{

	   static int kth(int arr[],int k){
	  int low=0,high=arr.length-1;
	  while(low<=high){
	  	int mid=low+(high-low)/2;
	  	int missing=arr[mid]-(mid+1);
	  	//if its found
	  	if(missing>=k)
	  		high=mid-1;
	  	else 
	  		low=mid+1;
	    
	        }
	        return low+k;
	  
	    }



	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class kthpostivemissingnooptimal{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}
		System.out.println("Enter the kth value : ");
		int k=sc.nextInt();
		System.out.println("Array entered by the user : ");
		MyArray.printArr(arr_1);
		int result=MyArray.kth(arr_1,k);
		if(result==-1)
			System.out.println("the missing element was not found ");
		else 
			System.out.println(" the "+k+" missing no is "+ result);
		sc.close();
	}
}