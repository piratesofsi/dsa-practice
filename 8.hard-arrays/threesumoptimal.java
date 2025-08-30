import java.util.*;


class Myarray{
	static ArrayList<ArrayList<Integer>> sum(ArrayList<Integer> arr,int target){
		
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		Collections.sort(arr);
		for(int i=0;i<arr.size();i++){
			int j=i+1;
			int k=arr.size()-1;
			if(i>0 && arr.get(i)==arr.get(i-1))
				continue;
		    
		    while(j<k){
		    	int sum=arr.get(i)+arr.get(j)+arr.get(k);
		    	if(sum<target){
                  j++;

		    	}
		    	else if(sum>target){
                          k--;

		    	}
		    	else {
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(arr.get(i));
                    temp.add(arr.get(j));
                    temp.add(arr.get(k));
                    j++;
                    k--;
                    ans.add(temp);
                    while(j<k && arr.get(j)==arr.get(j-1)) 
                    	j++;
                    while(j<k && arr.get(k)==arr.get(k+1))
                    	k--;


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
public class threesumoptimal{
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