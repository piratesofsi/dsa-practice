import java.util.*;


class MyArray{
	//finds maximum array 
	static int maximum(int arr[]){
		int greater=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			greater=Math.max(greater,arr[i]);
		}
		return greater;
	}
   //finds minimum of array 
	static int minimum(int arr[]){
		int smaller=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			smaller=Math.min(smaller,arr[i]);
		}
		return smaller;
	}


  //checks if bouquets can be formed or not if then return no of bouquets formed
	static int possible(int arr[],int day ,int m, int n){
		int count=0;
		int noOfBouquets=0;
         for(int i=0;i<arr.length;i++){
         	if(arr[i]<=day){
                count++;

         }
         else{
         	noOfBouquets+=(count/n);
         	count=0;
         }
         	

       }
       //left over bouquets after the loop ends 
       noOfBouquets+=(count/n);
       return noOfBouquets;
   
			
   }

   static int bloom(int arr[],int m,int n){ 
   	//checking there not enought no of flowers how the bouquets can be made 
   	//so return -1 and long is used to avoid the overflow if 
   	//m and n are too large 
   	
   	if((long)m*(long)n>arr.length)
  	return -1;
    int  low=minimum(arr) , high=maximum(arr);

   while(low<=high){
   	int mid=low+(high-low)/2;
   	if(possible(arr,mid,m,n)>=m)
   		high=mid-1;
   	else
   		low=mid+1;
            
             }

       return low;
   }



	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class minimumnoofbouquetsoptimal{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the days : ");
		int k=sc.nextInt();
		int arr_1[]=new int[k];
		System.out.println("Enter the "+k+ " days in the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Enter the no of bouquets required: ");
		int m=sc.nextInt();
		System.out.println("Enter the no of flowers required : ");
		int n=sc.nextInt();
        System.out.println("Arrays of days entered by the user : ");
        MyArray.printArr(arr_1);
        int result=MyArray.bloom(arr_1,m,n);
        System.out.println();
        if(result==-1){
        	System.out.println("bouquet cant be formed ");
        }
        else{
        	System.out.println("at "+result+" is the minimum day where the required bouquet can be formed ");
        }
		sc.close();
	}
}