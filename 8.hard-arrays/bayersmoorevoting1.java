import java.util.*;

class Myarray{

	static int zadakimajority(int arr[]){
		int candidate=arr[0];
		int vote=1;
		if(arr.length==1){
			candidate=arr[0];
			return candidate;
		}
		for(int i=1;i<arr.length;i++){
			if(vote==0){
				candidate=arr[i];
				vote=1;
			}
			else if(candidate==arr[i]){
				vote++;
			}
			else {
				vote--;
			}
		}
		return candidate;
	}

	static boolean manualCheck(int candidate,int arr[]){
		int count=0;

		for(int i=0;i<arr.length;i++){
			if(candidate==arr[i]){
                 count++;
			}
		}
		
		if(count>arr.length/2){
			return true;
		}
		return false;
	}



	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class bayersmoorevoting1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
	       for(int i=0;i<arr_1.length;i++){
	       	arr_1[i]=sc.nextInt();

	       }
	       System.out.println("Array entered by the user : ");
	       Myarray.printarr(arr_1);
	       int result=Myarray.zadakimajority(arr_1);
	       boolean result2=Myarray.manualCheck(result,arr_1);
	       System.out.println();

	       if(result2)
	       	System.out.println(result+ " is the majority element ");
	       else
	       	System.out.println("-1 is the majority element");
	       sc.close();
	}
}