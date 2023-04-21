import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter a Number to find Factorial");
        int Fact = scanf.nextInt();
        for (int i = (Fact - 1); i >= 1; i--) {
            Fact = Fact * i;
        }
        System.out.println("Factorial  is " + Fact);
    }
}
