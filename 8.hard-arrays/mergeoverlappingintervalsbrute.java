import java.util.*;

class Myarray {
    static ArrayList<ArrayList<Integer>> overlapping(ArrayList<ArrayList<Integer>> arr) {
        // sort by first element of each subinterval
        Collections.sort(arr, (a, b) -> a.get(0) - b.get(0));

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // iterate over intervals
        for (int i = 0; i < arr.size(); i++) {
            int start = arr.get(i).get(0);
            int end = arr.get(i).get(1);

            // skip if already covered
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1))
                continue;

            // merge with future overlapping intervals
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j).get(0) <= end) {
                    end = Math.max(end, arr.get(j).get(1));
                } else {
                    break;
                }
            }

            // add merged interval
            ans.add(new ArrayList<>(Arrays.asList(start, end)));
        }

        return ans;
    }
}

public class mergeoverlappingintervalsbrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of intervals: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr_1 = new ArrayList<>();
        System.out.println("Enter the intervals (start end):");

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(sc.nextInt()); // start
            temp.add(sc.nextInt()); // end
            arr_1.add(temp);
        }

        ArrayList<ArrayList<Integer>> result = Myarray.overlapping(arr_1);

        System.out.println("Overlapping intervals are:");
        for (ArrayList<Integer> interval : result) {
            System.out.println(interval);
        }

        sc.close();
    }
}
