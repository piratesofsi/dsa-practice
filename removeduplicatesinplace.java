import java.util.*;

class Myarray{

	static int dup(int arr[]){
		int i=0;
		for(int j=1;j<arr.length;j++){
		    if(arr[i]!=arr[j]){
		    	arr[i+1]=arr[j];
		    	i++;
		    }
		}
		return i+1;
	}






	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}





public class removeduplicatesinplace{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+"of elements in the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}


		System.out.println("array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		int result=Myarray.dup(arr_1);
		System.out.println("unique array : ");
		Myarray.printarr(arr_1);
		System.out.println("the no of unique elements in the array :  "+result);
		sc.close();

	}
}