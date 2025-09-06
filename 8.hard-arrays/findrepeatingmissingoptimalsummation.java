import java.util.*;

class Myarray{

	static int[] missRepeat(int arr[]){
		int n=arr.length;
	
		long s=0;
		long sn=n*(n+1)/2;
		long s2=0;
		long s2n=n*(n+1)*(2*n+1)/6;
		//calculating s and s2 from the array 
		for(int i=0;i<arr.length;i++){
			s+=arr[i];
			s2+=arr[i]*arr[i];
		}
 
		//calculating the differnce 
		long difference=sn-s;
		long squaredifference=s2n-s2;
		//calculating  the summation 
		long value1=squaredifference/difference;

         long missing=(value1+difference)/2;
       long  repeat=value1-missing;


		return new int [] {(int)repeat,(int)missing};
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class findrepeatingmissingoptimalsummation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the"+n+" elements of the array :");
         for(int i=0;i<arr_1.length;i++){
         	arr_1[i]=sc.nextInt();
         }

         System.out.println("Array entered by the user : ");
         Myarray.printArr(arr_1);
         System.out.println();
         int result[]=Myarray.missRepeat(arr_1);
         System.out.println("the repeating and missing no is : ");
         Myarray.printArr(result);
         sc.close();
	}
}