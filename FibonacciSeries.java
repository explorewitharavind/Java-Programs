import java.util.*;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter the Range for Fibonacci Series");
        int Number = scanf.nextInt();
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1);
        System.out.print(n2);
        for (int i = 2; i <= Number; i++) {
            n3 = n1 + n2;
            System.out.print(n3);
            n1 = n2;
            n2 = n3;

        }

    }
}