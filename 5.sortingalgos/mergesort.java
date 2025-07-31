import java.util.*;



class Myarray{

	static void ms(int arr[],int st,int end){
		if(st<end){
			int mid=st+(end-st)/2;
			ms(arr,st,mid);  //left half
			ms(arr,mid+1,end); //right half
			merge(arr,st,end,mid);  //sorting and merging 
		}
		
	}

	static void merge(int arr[],int st,int end ,int mid){
		int temp[]=new int[end-st+1];
		int i=st;
		int j=mid+1;
		int k=0;

		//sorting the array by comparing left and right 
		while(i<=mid && j<=end){
			if(arr[i]<arr[j]){
				temp[k++]=arr[i];
				i++;

			}
			else{
					temp[k++]=arr[j];
				     j++;

			}
		}
         
         //if arr[j] reached end 
		while(i<=mid){
			temp[k++]=arr[i];
				i++;


		}
		//if arr[i] reached end 
		while(j<=end){
			temp[k++]=arr[j];
			j++;
		}

	   //now to put the elements back into the main array 
		for(int p=0;p<k;p++){
			arr[p+st]=temp[p];
		}


	}




	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}




public class mergesort{
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
		Myarray.ms(arr_1,0,n-1);
		Myarray.printarr(arr_1);
		sc.close();
	}
}