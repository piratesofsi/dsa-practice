import java.util.Scanner;

public class PowerBruteForce {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        double result = 1.0;
        int exp = Math.abs(n);

        // multiply x, n times
        for (int i = 1; i <= exp; i++) {
            result *= x;
        }

        // if n is negative, take reciprocal
        if (n < 0) {
            result = 1.0 / result;
        }

        // output
        System.out.println("Result: " + result);

        sc.close();
    }
}
