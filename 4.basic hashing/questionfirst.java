import java.util.*;
public class questionfirst{
	public static void main(String[] args) {
		int arr_1[]={1,2,3,3,3,5,7,8,9,2,3};
		HashMap<Integer,Integer> h1=new HashMap<>();
		for(int x:arr_1){
			if(h1.containsKey(x)){ 
              h1.put(x,h1.get(x)+1);
				
			}
				else{
					h1.put(x,1);
				}
			
		}
		System.out.println(" the map is "+h1.entrySet());
		int maxfreq=0;
		int ansKey=-1;
		for(var e:h1.entrySet()){
			if(e.getValue()>maxfreq){
				maxfreq=e.getValue();
				ansKey=e.getKey();
			}

		}
		System.out.printf(" %d has a max frequency of %d",ansKey,maxfreq);
	}
}