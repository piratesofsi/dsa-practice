import java.util.*;

class Myarray{

	static void merge(int arr1[],int arr2[],int m,int n){
	
		int idx=m+n-1;
		int i=m-1;
		int j=n-1;
		while(i>=0 &&  j>=0){
			if(arr2[j]>=arr1[i]){
				arr1[idx--]=arr2[j--];
			}
			else{
				arr1[idx--]=arr1[i--];

			}
		}
		while(j>=0){
			arr1[idx--]=arr2[j--];
		}
	}





	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class mergetwosortedarraysoptimal{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the both array : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		int arr_1[]=new int[m+n];
		int arr_2[]=new int[n];
	    System.out.println("Enter the "+m+" elements of the first array :");
	    for(int i=0;i<m;i++){
	    	arr_1[i]=sc.nextInt();
	    }
	    System.out.println("Enter the "+n+" elements of the second array :");
	    for(int i=0;i<arr_2.length;i++){
	    	arr_2[i]=sc.nextInt();
	    }
	    System.out.println("both arrays entered by the user : ");
	    Myarray.printarr(arr_1);
	    System.out.println();
	    Myarray.printarr(arr_2);
            System.out.println();
	    System.out.println("merged array is : ");
	    System.out.println();
	    Myarray.merge(arr_1,arr_2,m,n);
	    Myarray.printarr(arr_1);
	    sc.close();
	}
}