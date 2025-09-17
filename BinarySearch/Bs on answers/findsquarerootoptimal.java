import java.util.*;

class MyArray{
	static int findSqrt(int a){
		//taking it 0 as it more general coz sqrt of 0 will be 0 
		int ans=0;
		int low=0,high=a;
		while(low<=high){
			int mid=low+(high-low)/2;
			if((long)(mid*mid)<=a){
				ans=mid;
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
      return ans;
	}
}
public class findsquarerootoptimal{
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