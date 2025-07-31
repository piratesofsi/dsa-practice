import java.util.*;

class MyArray{
    static void printpattern(int n){
        int space;
        int stars;
        for(int i=0; i<2*n-1; i++){
            if(i<n){
             space = 2*(n - i - 1);

             stars=i;
        }
           else{
                stars=2*n-i-2;
                space=2*(i-n+1);

            }


            // Left stars
            for(int j=0; j<=stars; j++){
                System.out.print("* ");
            }

           
            
                for(int k=0; k<space; k++){
                    System.out.print("  ");
                }
            

            // Right stars
            for(int j=0; j<=stars; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

public class pattern14{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int rows = sc.nextInt();
        MyArray.printpattern(rows);
        sc.close();
    }
}
