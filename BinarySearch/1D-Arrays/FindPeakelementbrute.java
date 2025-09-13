import java.util.ArrayList;
import java.util.Scanner;

public class FindPeakelementbrute {
    public static int findPeakElement(ArrayList<Integer> arr) {
        // If the array has only one element, it's a peak.
        if (arr.size() == 1) {
            return 0;
        }

        // Check if the first element is a peak.
        if (arr.get(0) > arr.get(1)) {
            return 0;
        }

        // Check if the last element is a peak.
        if (arr.get(arr.size() - 1) > arr.get(arr.size() - 2)) {
            return arr.size() - 1;
        }

        // Iterate through the middle elements to find a peak.
        for (int i = 1; i < arr.size() - 1; i++) {
            if (arr.get(i) > arr.get(i - 1) && arr.get(i) > arr.get(i + 1)) {
                return i;
            }
        }

        // This is a fallback for problems where a peak isn't guaranteed.
        // For this specific problem, a peak is always guaranteed.
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Validate user input for array size.
        if (n <= 0) {
            System.out.println("The number of elements must be a positive integer.");
            scanner.close();
            return;
        }

        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        int peakIndex = findPeakElement(arr);
        if (peakIndex != -1) {
            System.out.println("A peak element is found at index: " + peakIndex);
            System.out.println("The value of the peak element is: " + arr.get(peakIndex));
        } else {
            System.out.println("No peak element found in the array.");
        }

        scanner.close();
    }
}