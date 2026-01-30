import java.util.*;

public class NextSmallerBrute {

    // ---- BRUTE FORCE FUNCTION ----
    static ArrayList<Integer> nextSmallerEle(int[] arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int nextSmaller = -1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    nextSmaller = arr[j];
                    break;
                }
            }

            ans.add(nextSmaller);
        }

        return ans;
    }

    // ---- HELPER ----
    static void print(ArrayList<Integer> list) {
        System.out.println(list);
    }

    // ---- TEST DRIVER ----
    public static void main(String[] args) {

        int[] arr1 = {4, 8, 5, 2, 25};
        System.out.println("Test Case 1:");
        print(nextSmallerEle(arr1));

        int[] arr2 = {13, 7, 6, 12};
        System.out.println("Test Case 2:");
        print(nextSmallerEle(arr2));

        int[] arr3 = {5, 5, 5, 5};
        System.out.println("Test Case 3:");
        print(nextSmallerEle(arr3));

        int[] arr4 = {10, 9, 8, 7};
        System.out.println("Test Case 4:");
        print(nextSmallerEle(arr4));
    }
}
