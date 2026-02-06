import java.util.Arrays;

public class noOfNgestoRight {

    // Function to count number of elements greater than arr[index]
    // to the right for each query index
    public static int[] count_NGE(int arr[], int indices[]) {

        int ans[] = new int[indices.length];

        // Loop over all queries
        for (int i = 0; i < indices.length; i++) {

            int queryIdx = indices[i];
            int ele = arr[queryIdx];
            int count = 0;

            // Traverse elements to the right
            for (int j = queryIdx + 1; j < arr.length; j++) {
                if (arr[j] > ele) {
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }

    // Driver code
    public static void main(String[] args) {

        // Predefined test case
        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int[] indices = {0, 2, 5};

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Query Indices: " + Arrays.toString(indices));

        int[] result = count_NGE(arr, indices);

        System.out.println("Count of NGE to the right for each query:");
        System.out.println(Arrays.toString(result));
    }
}
