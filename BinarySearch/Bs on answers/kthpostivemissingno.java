import java.util.*;

class MyArray{

	   static int kth(int arr[],int k){
	   	//input all elements in the set 
	   	HashSet<Integer> set=new HashSet<>();
	   	for(int x:arr){
	   		set.add(x);

	   	}

	   	//check if exists or not 
	   	int i=1;
	   	int count=0;
	   	while(count<=k){
	   		if(!set.contains(i))
	   			count++;
	   		//if count==k means kth missing element is found
	   		if(count==k)
	   			return i;
	   		i++;
	     
	      	}
	      	return -1;

	   }



	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class kthpostivemissingno{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}
		System.out.println("Enter the kth value : ");
		int k=sc.nextInt();
		System.out.println("Array entered by the user : ");
		MyArray.printArr(arr_1);
		int result=MyArray.kth(arr_1,k);
		if(result==-1)
			System.out.println("the missing element was not found ");
		else 
			System.out.println(" the "+k+" missing no is "+ result);
		sc.close();
	}
}