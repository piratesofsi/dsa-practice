import java.util.*;
class Myarray{
	static int counting(int arr[],int st,int end){
		int cnt=0;
	    if(st<end){
	    	int mid=st+(end-st)/2;
	    	cnt+=counting(arr,st,mid);
	    	cnt+=counting(arr,mid+1,end);
	    	cnt+=countPairs(arr,st,mid,end);
	    	merge(arr,st,end,mid);
	    }
	    
	    	return cnt;
	    
	}
     
	static void merge(int arr[],int st,int end ,int mid){
		int cnt=0;
		int temp[]=new int[end-st+1];
		int i=st;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end){
			if(arr[i]<arr[j]){
				temp[k++]=arr[i];
				i++;
			}
			else {
				
				temp[k++]=arr[j];
				j++;

			}
		}

		while(i<=mid){
			temp[k++]=arr[i];
				i++;

		}

		while(j<=end){
			temp[k++]=arr[j];
				j++;
		}

		//iterating and putting the elements in the correct place from temporary array to the main array
		for(int p=0;p<k;p++){
			arr[p+st]=temp[p];
		}
		

	}

    static int countPairs(int arr[],int low,int mid,int high){
    	int right=mid+1;
    	int count=0;
    	for(int i=low;i<=mid;i++){
    		while(right<=high && arr[i]>2*arr[right])
    			right++;
    		count+=right-(mid+1);
    	}
    	return count;
    }

	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class reversepairsoptimal{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
	    int arr_1[]=new int[n];
	     System.out.println("Enter the "+n+" elements of the array : ");
	     for(int i=0;i<n;i++){   //use n as if you use the arr.size()--> so the current size will be 0
	     	arr_1[i]=sc.nextInt();
	     }

	     System.out.println("Array entered by the user : ");
	     Myarray.printArr(arr_1);

	     int result=Myarray.counting(arr_1,0,n-1);
	     System.out.println();
	     System.out.println("the count of inversions in the given array is : "+ result);
	     sc.close();

		
	}
}