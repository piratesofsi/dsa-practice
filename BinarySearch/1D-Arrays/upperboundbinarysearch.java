import java.util.*;


class Myarray{

	static int bs(int arr[],int target){
		int low=0;
		int high=arr.length-1;
		int ans=arr.length;
		
        while(low<=high){
        	int mid=low+(high-low)/2;
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


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class upperboundbinarysearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Enter the target : ");
		int target=sc.nextInt();
		System.out.println("Array entered by the user : ");
		Myarray.printArr(arr_1);
		int result=Myarray.bs(arr_1,target);
		System.out.println();
		if(result==n)
			System.out.println("there's no upper bound as given target is too large!");
		else {
			System.out.println("upper bound is found  at index :  "+result);
		}
		sc.close();
	}
}