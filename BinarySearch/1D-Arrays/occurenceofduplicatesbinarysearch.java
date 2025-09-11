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

	static int counting(int arr[],int target){
        int lower=lowerBound(arr,target);
        int upper=upperBound(arr,target)-1;
        if(lower==arr.length || arr[lower]!=target)
        	return -1;
         return upper-lower+1;
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class occurenceofduplicatesbinarysearch{
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
		int result=MyArray.counting(arr_1,target);
		System.out.println();
		if(result==-1){
			System.out.println("target doesnt exist !!!");
		}
		else{
			System.out.println("the target exist for "+result+ " times ");
		}
		
		sc.close();
	}
}