import java.util.*;

class MyArray{

	static int function(int i,int arr[],int h){
		
		int totalHours=0;
		int hourly=i;
		for(int j=0;j<arr.length;j++){
            totalHours+=(int)Math.ceil((double)arr[j]/hourly);
            //early exit optimization 
            if(totalHours>h)
            	return totalHours;
		}
		return totalHours;
	}



	static int maximum(int arr[]){
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			maxi=Math.max(maxi,arr[i]);
		}
		return maxi;
	}
	static int kokoeating(int arr[],int h){
		//as the lowest can koko eat is 1 banana/hr
		//or my friend will be hungry lol
	    int low=1,high=maximum(arr);

			
	    

	    while(low<=high){
	    	int mid=low+(high-low)/2;
	    	if(function(mid,arr,h)<=h){
	    		
	    		high=mid-1;
	    	}
	    	else{
	    		low=mid+1;
	    	}
	    		    }
       
		
      return low;

	}
}
public class kokoeatingbananasoptimalbinarysearch{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the pile: ");
		int n=sc.nextInt();
		int pile[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<pile.length;i++){
			pile[i]=sc.nextInt();
		}

		System.out.println("Enter the value of the maximum hours : ");
		int hours=sc.nextInt();
         int result=MyArray.kokoeating(pile,hours);
         if(result==-1)
         	System.out.println("the answer doesnt exists !!!");
         else
         	System.out.println("koko eates at a speed of : "+result + " bananas per hour");
         sc.close();
	}
}