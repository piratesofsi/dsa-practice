

import java.util.*;

public class findhowmanytimesthearrayshasbeenrotatedoptimal {

    /**
     * Finds the minimum element in a rotated sorted array using binary search.
     * @param arr The rotated sorted array.
     * @return The minimum element in the array.
     */
    static int small(int arr[]) {
        int low = 0, high = arr.length - 1;
        int ans = Integer.MAX_VALUE;
        int index=-1;
        //if array has no element 
        if(arr.length==0)
        	return -1;
        //if array has only one element 
        if(arr.length==1)
        	return 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // if the subarray is already sorted, the minimum is at the beginning
            if (arr[low] <= arr[high]) {
                if(arr[low]<ans){
                	index=low;
                	ans=arr[low];
                }
               return index;
            }

            // check if the left part is sorted
            if (arr[low] <= arr[mid]) {
                if(arr[low]<ans){
                index=low;
                ans=arr[low];
                }          
                      low = mid + 1;
            }
            // otherwise, the right part must be sorted
            else {
                if(arr[mid]<ans){
                	index=mid;
                	ans=arr[mid];
                }
                high = mid - 1;
            }
        }
        return index;
    }

     static int findMin(int[] nums) {
        return small(nums);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get array size from user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        // Get array elements from user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
           
            nums[i] = sc.nextInt();
        }

        // Find and print the minimum element
        System.out.println("Array had been rotated  : " + findMin(nums) +" times ");
        
        sc.close();
    }
}