import java.util.*;

class Myarray{
	static int counting(ArrayList<Integer> arr){
		int count=0;
		for(int i=0;i<arr.size();i++){
			for(int j=i+1;j<arr.size();j++){
				if(arr.get(i)>arr.get(j)){
					count++;
				}

			}
		}
		return count;
	}

	static void printArr(ArrayList<Integer> arr){
		for(int num:arr){
			System.out.print(" "+num);
		}
	}
}




public class countinversions{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
	     ArrayList<Integer> arr_1=new ArrayList<>();
	     System.out.println("Enter the "+n+" elements of the array : ");
	     for(int i=0;i<n;i++){   //use n as if you use the arr.size()--> so the current size will be 0
	     	arr_1.add(sc.nextInt());
	     }

	     System.out.println("Array entered by the user : ");
	     Myarray.printArr(arr_1);

	     int result=Myarray.counting(arr_1);
	     System.out.println();
	     System.out.println("the count of inversions in the given array is : "+ result);
	     sc.close();

	}
}