import java.util.*;

class Myarray{

	static int[] merge(int arr1[],int arr2[]){
		int m=arr1.length;
		int n=arr2.length;
		int arr_3[]=new int[m+n];
		int i=0; 
		int j=0;
		int k=0;
		while(i<m && j<n){
			if(arr1[i]<=arr2[j]){
				arr_3[k++]=arr1[i++];
			}
			else {
				arr_3[k++]=arr2[j++];
			}
		}
		while(i<m){
			arr_3[k++]=arr1[i++];
		}
		while(j<n){
			arr_3[k++]=arr2[j++];
		}

		return arr_3;

	}





	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class mergetwosortedarraysbrute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the both array : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr_1[]=new int[m];
		int arr_2[]=new int[n];
	    System.out.println("Enter the "+m+" elements of the first array :");
	    for(int i=0;i<arr_1.length;i++){
	    	arr_1[i]=sc.nextInt();
	    }
	    System.out.println("Enter the "+m+" elements of the second array :");
	    for(int i=0;i<arr_2.length;i++){
	    	arr_2[i]=sc.nextInt();
	    }
	    System.out.println("both arrays entered by the user : ");
	    Myarray.printarr(arr_1);
	    System.out.println();
	    Myarray.printarr(arr_2);

	    System.out.println("merged array is : ");
	    int result[]=Myarray.merge(arr_1,arr_2);
	    Myarray.printarr(result);
	    sc.close();
	}
}