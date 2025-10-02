import java.util.*;

class MyArray{

	static void findPeak(int arr[][],int n,int m){
           for(int i=0;i<arr.length;i++){
           	for(int j=0;j<arr[i].length;j++){
           		int val=arr[i][j];
            		boolean isPeak=true;
                    
                    //up 
               if(i>0 && arr[i-1][j]>val) isPeak=false;

                   //down
               if(i<n-1 && arr[i+1][j]>val) isPeak=false;

                   //left
               if(j>0 && arr[i][j-1]>val) isPeak=false;

                   //right 
               if(j<m-1 && arr[i][j+1]>val) isPeak=false;

               if(isPeak){
               	System.out.println("Peak element is : "+val+ " at index "+i+j);
               	return;
               }    

                  }
             
               }
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



public class peakelement2Darraybrute{

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
		MyArray.findPeak(arr_1,n,m);
		sc.close();
	}
}