import java.util.*;
public class countfreq{
	public static void main(String[] args) {
		int arr_1[]={1,2,3,4,5,5,5,5,7,8,2};
		HashMap<Integer,Integer> map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		for(var x:arr_1){
			if(map.containsKey(x)){
				map.put(x,map.get(x)+1);
			}
			else{
				map.put(x,1);
			}
		}

		System.out.println("Enter the no of queries : ");
		int q=sc.nextInt();
		while(q>0){
			System.out.println("Enter the key: ");
			System.out.println();
			int key=sc.nextInt();
			if(map.containsKey(key)){
				System.out.printf("the key exists and it occurs %d  times\n",map.get(key));
			}
			else{
				System.out.println("it does not  exists");
			}
			q--;
		}

	}
}