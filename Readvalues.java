import java.util.Scanner;

public class Readvalues {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scanf = new Scanner(System.in)) {
            System.out.println("Enter the value of a");
            a = scanf.nextInt();
            System.out.println("Enter the value of b");
            b = scanf.nextInt();
        }
        System.out.println("The value of a = "  +a);
        System.out.println("The value of b = "  +b);

    }

}
