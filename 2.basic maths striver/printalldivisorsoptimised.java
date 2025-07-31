import java.util.*;

class Myarray{
	static ArrayList<Integer> allPrint(int n){
		ArrayList<Integer> ar=new ArrayList<>();
		for(int i=1;i<=Math.sqrt(n);i++){
			if(n%i==0)
			{
				ar.add(i);
				if((n/i)!=i){
					ar.add(n/i);
				}
			}
		}
		Collections.sort(ar);
		return ar;
	}
}




public class printalldivisorsoptimised{


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no : ");
		int n1=sc.nextInt();
		ArrayList<Integer> ar1=Myarray.allPrint(n1);
		for(int x:ar1 ){
			System.out.print(" "+x);
		}
		sc.close();
	}
}