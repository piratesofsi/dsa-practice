import java.util.*;

class Myarray{

	static int counting(int arr[],int target){
		int count=0;
		for(int i=0;i<arr.length;i++){
			int xor=0;
			for(int j=i;j<arr.length;j++){
				
				
                   xor^=arr[j];
				
				if(xor==target){
					count++;
				}
			}
		}
		return count;
	}


	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class countofsubarrayswithxorbetter{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}
		System.out.println("Enter the xor or the k : ");
		int k=sc.nextInt();
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		int result=Myarray.counting(arr_1, k);
		System.out.println("no of subarrays with xor K is : "+ result);
		sc.close();
	}
}