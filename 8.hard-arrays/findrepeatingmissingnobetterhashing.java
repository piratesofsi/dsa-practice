import java.util.*;

class Myarray{

	static int[] missRepeat(int arr[]){
		//create the hasharray 
		int n=arr.length;
		int hash[]=new int[n+1];
		//input hash values from the given arr
		for(int i=1;i<hash.length;i++){
            hash[arr[i-1]]++;
		}

		int miss=-1;
		int repeat=-1;
		//now check which value is missing & which is repeating
		for(int i=1;i<hash.length;i++){
			if(hash[i]==0)
				miss=i;
			if(hash[i]==2)
				repeat=i;
			if(miss!=-1 && repeat!=-1)
				break;

		}
		return new int[]{repeat,miss};
	}



	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class findrepeatingmissingnobetterhashing{
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
	   Myarray.printArr(arr_1);
	   int result[]=Myarray.missRepeat(arr_1);
	   System.out.println();
	   System.out.println("the value which  is repeated and missing is ");

	   Myarray.printArr(result);


	   

	   sc.close();
	}
}