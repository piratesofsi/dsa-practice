import java.util.*;

class MyArray{
	static int findSqrt(int a){
		//taking it 0 as it more general coz sqrt of 0 will be 0 
		int ans=0;
		for(int i=1;i<=a;i++){
			if((i*i)<=a){
				ans=i;
			}
			else{
				break;
			}
		}
      return ans;
	}
}
public class findsquarerootbrute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no which you have to find the square root :  ");
		int n=sc.nextInt();
        
        System.out.println("no entered by the user is : "+n);
        int result=MyArray.findSqrt(n);
        System.out.println("Square root of the given no is : "+ result);
        sc.close();
		


	}
}