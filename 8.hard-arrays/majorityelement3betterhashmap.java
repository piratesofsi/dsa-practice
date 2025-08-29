import java.util.*;

class Myarray{

	static ArrayList<Integer> zadakimajority(ArrayList<Integer> arr){
		HashMap<Integer,Integer> map=new HashMap<>();
		int n=arr.size();
		ArrayList<Integer> ans=new ArrayList<>();
	   //taking the element and their count in the hashmap
		for(int num:arr){
			map.put(num,map.getOrDefault(num,0)+1);
		}


		//now finding the majority element and putting 
		//it in the ans list 
		for(int key:map.keySet()){
			if(map.get(key)>n/3){
				ans.add(key);
			}

		}
		Collections.sort(ans);
		return ans;
	}



	static void printarr(ArrayList<Integer> arr){
		for(int num:arr){
			System.out.print(" "+num);
		}
	}
}

public class majorityelement3betterhashmap{
	
		 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();  // size of array

        ArrayList<Integer> arr_1 = new ArrayList<>();

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr_1.add(sc.nextInt());  // add elements into ArrayList
        }

        System.out.println("The array entered by the user: ");
        Myarray.printarr(arr_1);
          
        ArrayList<Integer> result=Myarray.zadakimajority(arr_1);
        Myarray.printarr(result);
        System.out.println();
        System.out.println("the element which have the most majority in the array is : ");
        Myarray.printarr(result);
        sc.close();

	}
}