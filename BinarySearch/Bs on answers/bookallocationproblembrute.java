import java.util.*;
class MyArray{


	//for calculating summation 
	static int summation(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}



	//for calculating maximum 
	static int maximum(int arr[]){
		int greater=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			greater=Math.max(greater,arr[i]);
		}
		return greater;
	}

	static int noofstudent(int arr[],int pages){
		int student=1,countofstudent=0;
		for(int i=0;i<arr.length;i++){
			//we the next arr[i] can be added 
			if((countofstudent+arr[i])<=pages){
				countofstudent+=arr[i];
			}

			else{
				student++;
				countofstudent=arr[i];
			}


		}
		return student;
	}

	static int bookall(int arr[],int students){
		//if the students are more and books are leess 
		//it can be solved as the it breaks the 
		//basic rule of the problem 
		//each student should atleast have 1 book 
		if(students>arr.length)
			return -1;
		for(int i=maximum(arr);i<=summation(arr);i++){
			if(noofstudent(arr,i)<=students)
				return i;


		}
		return -1;
	}



	static void printArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}
public class bookallocationproblembrute{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int arr_1[]=new int[n];
		System.out.println("Enter the "+n+" Elements of the array: ");
		for(int i=0;i<arr_1.length;i++){
			arr_1[i]=sc.nextInt();
		}

		System.out.println("Enter the no of students : ");
		int k=sc.nextInt();
		System.out.println("Array entered by the user : ");
		MyArray.printArr(arr_1);
		System.out.println();

		int result=MyArray.bookall(arr_1,k);
		if(result==-1)
			System.out.println("solution doesn't exists!!!");
		else 
			System.out.println("the maximum allocation after minimising : "+ result);
		sc.close();
	}
}