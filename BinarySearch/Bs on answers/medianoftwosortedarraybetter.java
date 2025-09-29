import java.util.*;


class MyArray{

	static double median(int arr1[],int arr2[]){
		    int n1=arr1.length;
		    int n2=arr2.length;
		    int i=0,j=0;
		    int count=0;
		    int n=(n1+n2);
		    int indx1=n/2;
		    int indx2=(n/2)-1;
		    int el1=-1, el2=-1;
		    while(i<n1 && j<n2){
		    	//if both lies in the first array means arr1
		    	if(arr1[i]<=arr2[j]){
		    		if(count==indx1)
		    			el1=arr1[i];
		    		if(count==indx2)
		    			el2=arr1[i];
		    		count++;
		    		i++;
		    	}
		    	//if both lies on the second array means arr2 
		    	else{
		    			if(count==indx1)
		    			el1=arr2[j];
		    		if(count==indx2)
		    			el2=arr2[j];
		    		count++;
		    		j++;

		    	}
		    }
          //if arr2 is ended then 
		    while(i<n1){
		    	if(count==indx1)
		    			el1=arr1[i];
		    		if(count==indx2)
		    			el2=arr1[i];
		    		count++;
		    		i++;
		    }

		    //if arr1 is ended then

         while(j<n2){
		    	if(count==indx1)
		    			el1=arr2[j];
		    		if(count==indx2)
		    			el2=arr2[j];
		    		count++;
		    		j++;
		    }

		    //check even odd 
		    if(n%2==0){
		      return (double)(el1+el2)/2.0;
		    }
          //if odd 
		    return (double)el1;
      
        
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}




public class medianoftwosortedarraybetter{

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