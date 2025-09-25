import java.util.Scanner;

class MyArray {
    static int countOfPainters(int arr[], int hours) {
        int painter = 1, countofhours = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((countofhours + arr[i]) <= hours) {
                countofhours += arr[i];
            } else {
                painter++;
                countofhours = arr[i];
            }
        }
        return painter;
    }

    static int summation(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static int maximum(int arr[]) {
        int greater = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            greater = Math.max(greater, arr[i]);
        }
        return greater;
    }

    static int naive(int arr[], int k) {
        // if the no of hours are less then the painters so each painter will not get a
        // work which will break the basic
        // conditon of the question
        if (arr.length < k)
            return -1;
        int low=maximum(arr) , high=summation(arr);
        while(low<=high){
            int mid=low+(high-low)/2;
            if(countOfPainters(arr, mid)<=k)
               high=mid-1;
               else 
               low=mid+1;

        }
        return low;
    }

    static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}

public class paintersproblemoptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr_1[] = new int[n];
        System.out.println("Enter the " + n + " Elements of the array : ");
        for (int i = 0; i < arr_1.length; i++) {
            arr_1[i] = sc.nextInt();
        }
        System.out.println("Enter the no of painters : ");
        int k = sc.nextInt();

        System.out.println("Array entered by the user : ");
        MyArray.printArr(arr_1);

        int result = MyArray.naive(arr_1, k);
        if (result == -1)
            System.out.println("solution doesnt exists !!!");
        else
            System.out.println("the min value  of the maximum hours for " + k + " is : " + result);

        sc.close();
    }
}
