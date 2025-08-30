import java.util.*;


class Myarray{
	static ArrayList<ArrayList<Integer>> sum(ArrayList<Integer> arr, int target) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    Collections.sort(arr);
   

    for (int i = 0; i < arr.size(); i++) {
        if (i > 0 && arr.get(i) == arr.get(i - 1)) continue; // skip duplicates for i

        for (int j = i + 1; j < arr.size(); j++) {
            if (j > i + 1 && arr.get(j) == arr.get(j - 1)) continue; // skip duplicates for j

             int k = j + 1;
            int l = arr.size() - 1;

            while (k < l) {
                long sum = (long) arr.get(i) + arr.get(j) + arr.get(k) + arr.get(l);

                if (sum < target) {
                    k++;
                } else if (sum > target) {
                    l--;
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr.get(i));
                    temp.add(arr.get(j));
                    temp.add(arr.get(k));
                    temp.add(arr.get(l));
                    ans.add(temp);

                    // skip duplicates
                    while (k < l && arr.get(k) == arr.get(k + 1)) k++;
                    while (k < l && arr.get(l) == arr.get(l - 1)) l--;

                    k++;
                    l--;
                }
            }
        }
    }

    return ans;
}


	static void printarr(ArrayList<Integer> arr){
		for(int num:arr){
			System.out.print(" "+num);
		}
	}
}
public class foursumoptimal{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		ArrayList<Integer> arr_1=new ArrayList<>();
		System.out.println("Enter "+n+" elements of the array : ");
		for(int i=0;i<n;i++){
			arr_1.add(sc.nextInt());
		}
		System.out.println("Enter the target : ");
		int k=sc.nextInt();

		System.out.println("Array entered by the user : ");
		Myarray.printarr(arr_1);
		System.out.println();
		ArrayList<ArrayList<Integer>> result=Myarray.sum(arr_1,k);
		System.out.println("the triplets are : ");
		if(result.isEmpty()){
			System.out.println(" No triplet in the array sums to "+ k);
		} else {
		for(ArrayList<Integer> num:result){
			System.out.println(result);
		}
	}
		sc.close();

	}

}