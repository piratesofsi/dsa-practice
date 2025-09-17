import java.util.*;

class MyArray{

	static int pow(int x,int n){
		long m=n;
		int ans=1;
		//if n is negative 
		if(n<0)
			m=-m;
		while(m>0){
			//if even 
			if(m%2==0){
				x*=x;
				m/=2;
			}
			else{
				ans*=x;
			    m--;
			}
		}
		if(n<0){
			return 1/ans;
		}

        return ans;
	}



	static int findNth(int a,int b){
		for(int i=0;i<b;i++){
			int ans=pow(i,a);
			if(ans==b)
				return i;
			else if(ans>b)
			  break;
		}
		return -1;
	}
}
public class nthsquarerootbrute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the exponent(n) : ");
		int n=sc.nextInt();
		System.out.println("Enter the final value(m) : ");
		int m=sc.nextInt();
         int result=MyArray.findNth(n,m);
         if(result==-1){
         	System.out.println("square root doesnt exists ");
         }
         else{
         	System.out.println("square root does exists when x= "+result);
         }
		sc.close();
	}
}