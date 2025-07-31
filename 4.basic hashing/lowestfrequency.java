import java.util.*;
public class lowestfrequency{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr_1[]={1,1,2,4,3,2,4,2,3,6,3,6,8};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(var x:arr_1){
			if(map.containsKey(x)){
				map.put(x,map.get(x)+1);
			}
			else{
				map.put(x,1);
			}
		
		}
			System.out.println(" "+map);
			int maxfreq=Integer.MAX_VALUE;
			int ansKey=0;
			for(var i:map.entrySet()){
				if(i.getValue()<maxfreq) {
					maxfreq=i.getValue();
				    ansKey=i.getKey();
				}

			}

			System.out.printf("%d has a lower lowestfrequency of %d",ansKey,maxfreq);



		sc.close();
	}
}