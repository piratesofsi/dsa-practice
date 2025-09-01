import java.util.*;

class Myarray{

	static int counting(int arr[], int target) {
    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1); // dummy prefixXor
    int xr = 0;   // prefixXor till now
    int count = 0;

    for(int i=0; i<arr.length; i++) {
        xr ^= arr[i];  // update prefixXor

        int x = xr ^ target; // required value

        if(map.containsKey(x)) {
            count += map.get(x); // add frequency
        }

        map.put(xr, map.getOrDefault(xr,0) + 1); // update freq
    }

    return count;
}



	static void printarr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class countofsubarraywithxoroptimal{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" elements of the array : ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}
		System.out.println("Enter the xor or the k : ");
		int k=sc.nextInt();
		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		int result=Myarray.counting(arr_1, k);
		System.out.println("no of subarrays with xor K is : "+ result);
		sc.close();
	}
}