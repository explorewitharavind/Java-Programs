import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = scn.nextInt();

        if (n == 1) {
            System.out.println("NO");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return;
            }
        }

        System.out.println(n + " is a prime number");
    }
}