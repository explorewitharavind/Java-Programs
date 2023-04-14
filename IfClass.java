import java.util.Scanner;

public class IfClass {
    public static void main(String[] args) {
        int Age;
        System.out.println("Enter Your Age");
        try (Scanner scan = new Scanner(System.in)) {
            Age = scan.nextInt();
        }
        if (Age > 18) {

            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

    }

}