import java.util.*;

class MyArray{
	static int findMax(int arr[][],int n,int m,int col){
		int maxValue=-1;
		int index=-1;
		for(int i=0;i<arr.length;i++){
            if(arr[i][col]>maxValue){
            	maxValue=arr[i][col];
            	index=i;
            }
		}
		return index;
	}

	static int[] findPeak(int arr[][],int n,int m){
          int low=0, high=m-1;
          while(low<=high){
          	int mid=low+(high-low)/2;
          	int maxRow=findMax(arr,n,m, mid);
          	//if we found the peak
          	//find left and right 
            int left=(mid-1>=0)?arr[maxRow][mid-1]:-1;
            int right=(mid+1<m)?arr[maxRow][mid+1]:-1;

          	if(left<arr[maxRow][mid] && arr[maxRow][mid]>right)
          		return new int[]{maxRow,mid};
          	//if it's on the left 
         else if(left>arr[maxRow][mid])
          		high=mid-1;
          	else 
          		low=mid+1;
          }
          return new int[]{-1,-1};
	}




	static void printArr(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
}



public class peakelement2Darrayoptimal{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row : ");
		int n=sc.nextInt();
		System.out.println("Enter the col : ");
		int m=sc.nextInt();
		int arr_1[][]=new int[n][m];
		System.out.println(" Enter the "+n*m+" elements of the array: ");
		for(int i=0;i<arr_1.length;i++){
			for(int j=0;j<arr_1[i].length;j++){
				arr_1[i][j]=sc.nextInt();
			}
		}

		System.out.println(" array entered by the user : ");
		MyArray.printArr(arr_1);
        System.out.println();
		int result[]=MyArray.findPeak(arr_1,n,m);
		System.out.println("the peak element is at index : ");
		for(int i=0;i<result.length;i++){
			System.out.print(""+result[i]);
		}
		sc.close();
	}
}