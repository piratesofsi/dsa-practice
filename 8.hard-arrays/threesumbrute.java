import java.util.*;


class Myarray{
	static ArrayList<ArrayList<Integer>> sum(ArrayList<Integer> arr,int target){
		HashSet<ArrayList<Integer>> set=new HashSet<>();
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		for(int i=0;i<arr.size();i++){
			for(int j=i+1;j<arr.size();j++){
				for(int k=j+1;k<arr.size();k++){
                if(arr.get(i)+arr.get(j)+arr.get(k)==target){
                	ArrayList<Integer> temp=new ArrayList<>();
                	temp.add(arr.get(i));
                	temp.add(arr.get(j));
                	temp.add(arr.get(k));
                	Collections.sort(temp);
                	set.add(temp);
                }
            }
             
			}
		}
        ans.addAll(set);
		return ans;

	}

	static void printarr(ArrayList<Integer> arr){
		for(int num:arr){
			System.out.print(" "+num);
		}
	}
}
public class threesumbrute{
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
			System.out.println(num);
		}
	}
		sc.close();

	}

}