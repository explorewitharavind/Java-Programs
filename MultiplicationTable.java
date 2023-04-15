import java.util.Scanner;
import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        int Number;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter a Number To get Multiplication Table ");
        Number = scanf.nextInt();
        System.out.println("Multiplication Table of " + Number + " is ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(Number + "*" + i + "=" + Number * i);

        }

    }
}
