import java.util.*;


class Myarray{
	static void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	static int partition(int arr[],int st,int end){
		int pidx=arr[end];
		int idx=st-1;
		
		for(int j=st;j<end;j++){
			if(pidx>arr[j]){
				idx++;
				swap(arr,idx,j);

			}

		}
		idx++;
		swap(arr,idx,end);
		return idx;
	}





	static void qs(int arr[],int st,int end){
		
		if(st<end){
			int pivotidx=partition(arr,st,end);
		qs(arr,st,pivotidx-1);
		qs(arr,pivotidx+1,end);
	    }

	}

	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}





public class quicksort{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements in the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("array entered by the user: ");
		Myarray.printarr(arr_1);
		System.out.println();
		System.out.println("sorted array : ");
		Myarray.qs(arr_1,0,n-1);
		Myarray.printarr(arr_1);
		sc.close();

	}
}