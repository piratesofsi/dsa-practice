import java.util.*;

class MyArray{
	//finds maximum array 
	static int maximum(int arr[]){
		int greater=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			greater=Math.max(greater,arr[i]);
		}
		return greater;
	}
   //finds minimum of array 
	static int minimum(int arr[]){
		int smaller=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			smaller=Math.min(smaller,arr[i]);
		}
		return smaller;
	}

	static long checkIf(int arr[],int div,int k){
		//use long to avoid overflow
		long count=0;
		for(int i=0;i<arr.length;i++){
			count+=(arr[i] + div - 1) / div; //integer as it more efficient than math ceil
			//(long)Math.ceil((double)arr[i]/div);-->my method
		}
		return count;
	}

	static int  findingDivisor(int arr[],int k){
	      int low=minimum(arr),high=maximum(arr);
	      while(low<=high){
	      	int mid=low+(high-low)/2;
	      	if(checkIf(arr,mid,k)<=k)
	      		high=mid-1;
	      	else 
	      		low=mid+1;
	      }
	      return low;

	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class minimumdivisorgiventhresholdoptimal{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1 []=new int[n];
		System.out.println("Enter the "+n+" elements of the array: ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}
		System.out.println("Enter the value of threshold : ");
		int k=sc.nextInt();
		System.out.println("Array entered by the user : ");
		MyArray.printArr(arr_1);
		System.out.println();
		int result=MyArray.findingDivisor(arr_1,k);
		if(result==-1)
			System.out.println("divisor doesn't exists ");
		else
			System.out.println("the minimum divisor is : "+ result);
		sc.close();
	}
}