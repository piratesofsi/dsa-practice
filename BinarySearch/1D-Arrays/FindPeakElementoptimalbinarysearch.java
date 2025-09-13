import java.util.Scanner;

class Solution {
    public int findPeakElement(int[] nums) {
        int low = 1;
        int high = nums.length - 2;
        
        //if array has only one element 
        if (nums.length == 1) {
            return 0;
        }
        
        //if first element is the peak element 
        if (nums[0] > nums[1]) {
           return 0;
        }
        
        //if the last element is the peak 
        if (nums[nums.length - 1] > nums[nums.length - 2]) {
            return nums.length - 1;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            //left 
            if (nums[mid] > nums[mid - 1]) {
                low = mid + 1;
            }
            //right
           else if (nums[mid] > nums[mid + 1]) {
                high = mid - 1;
            }
            else {
                high = mid - 1;
            }
        }
     return -1;
    }
}

public class FindPeakElementoptimalbinarysearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get array size from user
        System.out.println("Enter the size of the array :");
        int n = scanner.nextInt();

        // Get array elements from user
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array, separated by spaces:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Create a Solution object and find the peak element
        Solution solution = new Solution();
        int peakIndex = solution.findPeakElement(nums);

        // Print the result
        if (peakIndex != -1) {
            System.out.println("A peak element is found at index: " + peakIndex);
            System.out.println("The value of the peak element is: " + nums[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }

        scanner.close();
    }
}