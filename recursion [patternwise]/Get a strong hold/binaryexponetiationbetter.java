import java.util.Scanner;

public class binaryexponetiationbetter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter value of x: ");
        double x = sc.nextDouble();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        long exp = n;
        double ans = 1.0;

        // handle negative exponent
        if (exp < 0) {
            exp = -exp;
        }

        while (exp > 0) {
            // if odd
            if (exp % 2 == 1) {
                ans *= x;
                exp--;
            }
            // if even
            else {
                x *= x;
                exp /= 2;
            }
        }

        // if n was negative
        if (n < 0) {
            ans = 1.0 / ans;
        }

        // output
        System.out.println("Result: " + ans);

        sc.close();
    }
}
