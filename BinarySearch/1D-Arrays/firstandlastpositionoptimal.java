import java.util.*;


class MyArray{
	static int lowerBound(int arr[],int target){
		int low=0,high=arr.length-1;
		int ans=arr.length;
		while(low<=high){
			int mid=low+(high-low)/2;
			//maybe it can be answer so right search space is neglected
			if(arr[mid]>=target){
				ans=mid;
			
			  high=mid-1;
                       }
                       else{
                       	low=mid+1;
                       }


		}
		return ans;
	}
	static int upperBound(int arr[],int target){
		int low=0,high=arr.length-1;
		int ans=arr.length;
		while(low<=high){
			int mid=low+(high-low)/2;
			//maybe it can be answer so right search space is neglected
			if(arr[mid]>target){
				ans=mid;
			
			  high=mid-1;
                       }
                       else{
                       	low=mid+1;
                       }


		}
		return ans;
	}

	static int[] find(int arr[],int target){
        int lower=lowerBound(arr,target);
        if(lower==arr.length || arr[lower]!=target)
        	return new int[]{-1,-1};
         return new int[]{lower,upperBound(arr,target)-1};
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class firstandlastpositionoptimal{
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