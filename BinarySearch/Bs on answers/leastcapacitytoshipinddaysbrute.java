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

	static int sum(int arr[]){
		int n=arr.length;
		int summation=0;
		for(int i=0;i<arr.length;i++){
			summation+=arr[i];
		}
		return summation;
	}

	static int shipCapacity(int arr[],int d){
	     for(int i=maximum(arr);i<=sum(arr);i++){
	     	if(function(arr,i,d)<=d)
	     		return i;
	     }
	     //if capacity is not found 
	     return -1;
	}

	static int function(int arr[],int capacity,int d){
		int dayReq=1,load=0;
		for(int i=0;i<arr.length;i++){
			if(load+arr[i]>capacity){
				dayReq++;
				load=arr[i];
			}
			else{
				load+=arr[i];
			}
		}
		
		return dayReq;
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class leastcapacitytoshipinddaysbrute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Enter the no of days : ");
		int d=sc.nextInt();
		System.out.println("Array entered by the user :  ");
		MyArray.printArr(arr_1);
		int result=MyArray.shipCapacity(arr_1,d);
		System.out.println();
		if(result==-1)
			System.out.println("sorry ship cant be shipped within "+d+" days");
		else 
			System.out.println("the least capacity the ship can be shipped in "+d+" days is : "+ result);
		sc.close();
	}
}