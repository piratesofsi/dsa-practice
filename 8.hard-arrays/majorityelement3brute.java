import java.util.*;

class Myarray {

       static ArrayList<Integer> zadakimajority(ArrayList<Integer> arr){
       ArrayList<Integer> ans=new ArrayList<>();  
       int n=arr.size(); 
        for(int i=0;i<arr.size();i++){
            int count =0;
           int  num=arr.get(i);
             for(int j=0;j<arr.size();j++){
                  if(num==arr.get(j)){
                    count++;
                  }
             }
             if(count>n/3 && !ans.contains(num)){
                ans.add(num);
             }
             if(ans.size()==2)
                break;
           }
           Collections.sort(ans);
           return ans;
       }



    static void printarr(ArrayList<Integer> arr) {
        for (int num : arr) {
            System.out.print(" " + num);
        }
    }
}

public class majorityelement3brute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();  // size of array

        ArrayList<Integer> arr_1 = new ArrayList<>();

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr_1.add(sc.nextInt());  // add elements into ArrayList
        }

        System.out.println("The array entered by the user: ");
        Myarray.printarr(arr_1);
          
        ArrayList<Integer> result=Myarray.zadakimajority(arr_1);
        Myarray.printarr(result);
        System.out.println();
        System.out.println("the element which have the most majority in the array is : ");
        Myarray.printarr(result);
        sc.close();

    }
}
