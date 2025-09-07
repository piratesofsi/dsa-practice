import java.util.*;

class Myarray {
    static ArrayList<ArrayList<Integer>> overlapping(ArrayList<ArrayList<Integer>> arr) {
        // sort by first element of each subinterval
        Collections.sort(arr, (a, b) -> a.get(0) - b.get(0));

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         for(int i=0;i<arr.size();i++){
            if(ans.isEmpty() || arr.get(i).get(0)>ans.get(ans.size()-1).get(1)){
                ArrayList<Integer> temp=new ArrayList<>();
                temp.add(arr.get(i).get(0));
                temp.add(arr.get(i).get(1));
                ans.add(temp);
             
         }
         else {
             ans.get(ans.size() - 1).set(1,
                                            Math.max(ans.get(ans.size() - 1).get(1), arr.get(i).get(1)));
         }
            }
        return ans;
    }
}

public class mergeoverlappingintervalsoptimal {
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
