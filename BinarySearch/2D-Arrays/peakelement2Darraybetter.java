import java.util.*;

class MyArray{

	static int[] findPeak(int arr[][],int n,int m){
		   int greater=0;
       int k=0,l=0;
           for(int i=0;i<arr.length;i++){
           	for(int j=0;j<arr[i].length;j++){
              
           		if(greater<arr[i][j]){
                    greater=arr[i][j];
                         k=i;
                         l=j;
                }
                  }
             
               }
               return new int[]{k,l};
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



public class peakelement2Darraybetter{

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
		System.out.println(" the peak element is found at index : ");
		for(int i=0;i<result.length;i++){
			System.out.print(""+result[i]);
		}
		sc.close();
	}
}