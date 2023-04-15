import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        int x, y;
        try (Scanner scanf = new Scanner(System.in)) {
            System.out.println("Enter the First Number");
            x = scanf.nextInt();
            System.out.println("Enter the Second Number");
            y = scanf.nextInt();
        }
        int c = x * y;
        System.out.println("The Product of Two Numbers is " + c);
    }
}
