import java.util.*;
public class hashmap1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr_1[]={1,2,2,2,5,2,6,3,7};
		HashMap<Integer,Integer> h1=new HashMap<>();
		for(var e:arr_1){
			if(h1.containsKey(e))
				h1.put(e,h1.get(e)+1);
			else
				h1.put(e,1);

		}

		int mxFreq=0;
		int ansKey=-1;
		for(var r:h1.entrySet()){
			if(r.getValue()>mxFreq){
				mxFreq=r.getValue();
				ansKey=r.getKey();
			}
		}

		System.out.printf("%d has a max frequency of %d",ansKey,mxFreq);
		sc.close();
	}
}