import java.util.*;


class MyArray{
	static boolean canbeplaced(int arr[],int k,int distance){
		int countCows=1,last=arr[0];
		// i starts from 1 as at 0 cow 1 is placed 
		for(int i=1;i<arr.length;i++){
			//if its greater or equal to the minimum distance 
			//then place the cows 
			if((arr[i]-last)>=distance){
				countCows++;
			    last=arr[i];
            }

		}

		//if count of cows is less then 2 then return false
		if(countCows<2)
			return false;
		//if count of cows is >= of of the k or given cows means 
			  //they can all be placed so return true;
			  if(countCows>=k)
			  return true; 

   return false;
	}

	static int cows(int arr[],int k){
		//first sort the array 
		Arrays.sort(arr);
         

         int low=1,high=arr[arr.length-1]-arr[0];
         while(low<=high){
         	int mid=low+(high-low)/2;
         	//if cow can be placed then find the max 
         	//move low=mid+1
         	if(canbeplaced(arr,k,mid))
         		low=mid+1;
         	else 
         		high=mid-1;
         }

         return high;
		

	   
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class aggressivecowsoptimal{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Enter the no of cows : ");
		int k=sc.nextInt();
		System.out.println("Array entered by the user : ");
		MyArray.printArr(arr_1);
		int result=MyArray.cows(arr_1,k);
		System.out.println();
		if(result==-1)
			System.out.println("cows cant be placed !!!");

		else
			System.out.println("min of max is :  "+ result);
		sc.close();
	}
}