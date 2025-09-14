import java.util.*;


class MyArray{

	static int single(int arr[]){
		//if there's only single element in the array 
		if(arr.length==1)
			return arr[0];
		//if the first element is the single element 
		if(arr[0]!=arr[1])
			return arr[0];
		//if the last element is the single element 
         if(arr[arr.length-1]!=arr[arr.length-2])
         	return arr[arr.length-1];

         //for the middle element 
         for(int i=1;i<arr.length-1;i++){
         	if(arr[i]!=arr[i-1] && arr[i]!=arr[i+1])
         		return arr[i];

         }
         return -1;
	}



	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class singleelementinsortedarraybrute{
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
		MyArray.printArr(arr_1);
		System.out.println();
		int result=MyArray.single(arr_1);
		System.out.println();
        if(result==-1){
        	System.out.println("there's no single element in the array!!");

        }
        else{
        	System.out.println("the single element is : "+ result);
        }
		sc.close();
	}
}