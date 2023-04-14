import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int Number;
        System.out.println("Enter a Number to be Checked");
        try (Scanner scanf = new Scanner(System.in)) {
            Number = scanf.nextInt();
        }
        if (Number % 2 == 0) {
            System.out.print(Number + " is Even Number");
        } else {
            System.out.println(Number + " is Odd Number");
        }

    }
}
