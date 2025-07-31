import java.util.*;



class Myarray{
	static int maximum(int arr[]){
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];

			}
		}
		return max;
	}


	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}





public class largestelement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
	     System.out.println("Enter the "+n+" elements in the array: ");
	     for(int i=0;i<arr_1.length;i++){
	       arr_1[i]=sc.nextInt();
	     }
	     System.out.println("array entered by the user  : ");
	     Myarray.printarr(arr_1);
	     int result=Myarray.maximum(arr_1);
	     System.out.println();
	     System.out.println("the maximum element in the array is "+ result);
	     sc.close();

	}
}