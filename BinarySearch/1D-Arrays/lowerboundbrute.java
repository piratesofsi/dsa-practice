import java.util.*;


class Myarray{

	static int linearsearch(int arr[],int n,int target){
		int ans=n;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=target){
				ans=i;
				break;
			}
		}
		return ans;
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class lowerboundbrute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Enter the target : ");
		int target=sc.nextInt();
		System.out.println("Array entered by the user : ");
		Myarray.printArr(arr_1);
		int result=Myarray.linearsearch(arr_1,n,target);
		System.out.println();
		if(result==n)
			System.out.println("there's no upper bound as given target is too large!");
		else {
			System.out.println(target +" is found at index :  "+result);
		}
		sc.close();
	}
}