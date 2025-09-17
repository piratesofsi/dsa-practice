import java.util.Scanner;

public class powoptimal {
    double myPow(double x, int n) {
        double ans = 1;
        long m = n;   // cast to long to avoid overflow

        // handle negative powers by making exponent positive
        if (m < 0) {
            m = -m;
        }

        while (m > 0) {
            // if exponent is even
            if (m % 2 == 0) {
                x *= x;
                m /= 2;
            }
            // if exponent is odd
            else {
                ans *= x;
                m--;
            }
        }

        // if original n was negative, take reciprocal
        if (n < 0) {
            return 1 / ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        powoptimal sol = new powoptimal(); // ✅ create object of powoptimal

        System.out.print("Enter base (x): ");
        double x = sc.nextDouble();

        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();

        double result = sol.myPow(x, n);
        System.out.println(x + " raised to power " + n + " = " + result);

        sc.close();
    }
}
