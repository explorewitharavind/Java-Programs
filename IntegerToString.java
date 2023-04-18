import java.util.Scanner;
import java.util.*;

public class IntegerToString {
    public static void main(String[] args) {
        String S;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter a Number into the String");
        S = scanf.nextLine();
        int Number = Integer.parseInt(S);
        System.out.println("Converting String to Integer");
        System.out.println("Now its an Integer Number " + Number);
    }
}