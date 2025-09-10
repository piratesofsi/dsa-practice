import java.util.*;

class Myarray{
	static int getFloor(int arr[],int target){
		//sort the array js to be sure 
		Arrays.sort(arr);
   int low=0;
   int high=arr.length-1;
   int ans=-1;
   while(low<=high){
     int mid=low+(high-low)/2;
     if(arr[mid]<=target){
        ans=arr[mid];
        low=mid+1;
     }
     else {
       high=mid-1;
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
public class getfloor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array: ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}
		System.out.println("Enter the target : ");
		int target=sc.nextInt();

		System.out.println("Array entered by the user : ");
		Myarray.printArr(arr_1);
		int result=Myarray.getFloor(arr_1,target);
		System.out.println();
		if(result==-1){
			System.out.println("floor value is not found ");
		}
		else {
			System.out.println("floor value is "+result);
		}
		sc.close();
	}
}