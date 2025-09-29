import java.util.*;


class MyArray{

	static double median(int arr1[],int arr2[],int n1,int n2){
		//if arrays has no element then 
		if(n1==0 && n2==0 )
			return 0;
		//if arrays has only one element then 
		if((n1==0 && n2==1) || (n1==1 && n2==0))
			return 0;
		int ans[]=new int[n1+n2];
		int n=n1+n2;
		int k=0,i=0,j=0;
		//if both pointer are one the two arrays 
		while(i<n1 && j<n2){
			 if(arr1[i]<=arr2[j])
			 	ans[k++]=arr1[i++];

			 else 
			 	ans[k++]=arr2[j++];

		}

		//if j is finished and i is still remaining 
		while(i<n1){
			ans[k++]=arr1[i++];
		}

		//if i is finished and j is still remaining 
		while(j<n2){
			ans[k++]=arr2[j++];
		}

		//if even
		if(n%2==0){
			int m1=(n/2)-1;
			int m2=n/2;
			return (double)(ans[m1]+ans[m2])/2.0;
		}

		//if odd 
		else {
			int m1=n/2;
			return (double)ans[m1];
		}

      
        
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}




public class medianoftwosortedarraybrute{

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
        double result=MyArray.median(arr_1,arr_2,n1,n2);
           System.out.println();
           if(result==-1)
           	System.out.println(" median is not found !!!!");
           else 
           	System.out.println(" median for the given two array is : " + result);

		sc.close();
	}
}