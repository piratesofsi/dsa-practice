import java.util.Scanner;

public class PowerRecursive {

    private static double power(double x, long n) {
        // base case
        if (n == 0) {
            return 1.0;
        }

        if (n % 2 == 0) {
            return power(x * x, n / 2);
        } else {
            return x * power(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        long exp = n;
        double result;

        if (exp < 0) {
            exp = -exp;
            result = 1.0 / power(x, exp);
        } else {
            result = power(x, exp);
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
