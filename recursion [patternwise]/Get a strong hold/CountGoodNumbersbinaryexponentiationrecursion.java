import java.util.Scanner;

public class CountGoodNumbersbinaryexponentiationrecursion {

    static final long MOD = 1_000_000_007;

    // fast power using recursion (binary exponentiation)
    private static long pow(long x, long n) {
        if (n == 0) {
            return 1;
        }

        if (n % 2 == 0) {
            return pow((x * x) % MOD, n / 2);
        } else {
            return (x * pow(x, n - 1)) % MOD;
        }
    }

    public static int countGoodNumbers(long n) {

        long noOfEvens = (n + 1) / 2; // even indices
        long noOfOdds = n / 2;       // odd indices

        long evenWays = pow(5, noOfEvens);
        long oddWays = pow(4, noOfOdds);

        return (int) ((evenWays * oddWays) % MOD);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        long n = sc.nextLong();

        int result = countGoodNumbers(n);

        System.out.println("Number of good numbers: " + result);

        sc.close();
    }
}
