import java.util.*;


class MyArray{
	static int max(int a,int b){
		int greater=(a>b)?a:b;
        return greater;
      
	}

	static int min(int a,int b){
		int smaller=(a<b)?a:b;
		return smaller;
	}

	static double median(int arr1[],int arr2[]){
		    int n1=arr1.length;
		    int n2=arr2.length;
		    int low=0,high=n1;
		    int n=(n1+n2);
		    int left=(n1+n2+1)/2; //used 1 for even and odd both will give 
		    //right answer 
		    while(low<=high){
		    	int mid1=low+(high-low)/2;
		    	int mid2=left-mid1;
		    	//default values 
		    	int L1=(mid1>0)?arr1[mid1-1]:Integer.MIN_VALUE;
		    	int L2=(mid2>0)?arr2[mid2-1]:Integer.MIN_VALUE;
		    	int R1=(mid1<n1)?arr1[mid1]:Integer.MAX_VALUE;
		    	int R2=(mid2<n2)?arr2[mid2]:Integer.MAX_VALUE;
		    	//valid configuration is found 
		    	if(L1<=R2 && L2<=R1){

		    		//find median 
		    		//for even 
		    		if(n%2==0)
		    		return (double)(max(L1,L2)+min(R1,R2))/2.0;
		    	  //for odd
		    	else
		    		return (double)max(L1,L2);

		    	}
		    	else if(L2 > R1)
		    		low=mid1+1;
		    	else 
		    		high=mid1-1;

		    }
  //dummy as it needs to return something as double
    return 0;
        
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}




public class medianoftwosortedarrayoptimal{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the first array : ");
		int n1=sc.nextInt();
		int arr_1[]=new int[n1];
		System.out.println("Enter the size of the second array : ");
		int n2=sc.nextInt();
		int arr_2[]=new int[n2];
		System.out.println("Enter the "+n1+" elements of the first array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Enter the "+n2+" elements of the second  array : ");
		for(int i=0;i<arr_2.length;i++){
			arr_2[i]=sc.nextInt();
		}

		System.out.println("Arrays entered by the user :  ");
		MyArray.printArr(arr_1);
		System.out.println();
		MyArray.printArr(arr_2);
        System.out.println();
        double result=MyArray.median(arr_1,arr_2);
           System.out.println();
           if(result==-1)
           	System.out.println(" median is not found !!!!");
           else 
           	System.out.println(" median for the given two array is : " + result);

		sc.close();
	}
}