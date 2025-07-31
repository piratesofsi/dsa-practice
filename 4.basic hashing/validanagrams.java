import java.util.*;


class Myarray{
	static HashMap<Character,Integer> makemap(String s){
		HashMap<Character,Integer> map=new HashMap<>();

		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
		    map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		return map;
	}
}






public  class validanagrams{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings : ");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		HashMap<Character,Integer> mp1=Myarray.makemap(s1);
		HashMap<Character,Integer> mp2=Myarray.makemap(s2);
		System.out.println(" "+mp1);
		System.out.println(" "+mp2);
		if(mp1.equals(mp2)){
			System.out.println("it is a anagram !!!!");
		}
		else{
			System.out.println("it is not an anagram");
		}
		sc.close();



	}
}