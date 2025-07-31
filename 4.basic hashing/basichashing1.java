import java.util.*;
public class basichashing1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//creating a hashmap
		HashMap<String,Integer> map=new HashMap<>();
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.println("Enter the String  : ");
			String key=sc.nextLine();
			
			System.out.println("Enter the integer: ");
			int value=sc.nextInt();
			sc.nextLine();
			map.put(key,value);
		}
		
		sc.close();

	
	}
}
