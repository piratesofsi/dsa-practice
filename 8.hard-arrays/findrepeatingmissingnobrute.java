import java.util.*;

class Myarray{

	static int[] missRepeat(int arr[]){
		int repeat=-1,miss=-1;
		for(int i=1;i<=arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(arr[j]==i)
					count++;
			}
			if(count==0)
				miss=i;
			if(count==2)
				repeat=i;
			if(miss!=-1 && repeat!=-1)
				break;
		}
		return new int [] {repeat,miss};
	}


	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class findrepeatingmissingnobrute{
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