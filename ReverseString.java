import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String Reverse;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter a String");
        Reverse = scanf.nextLine();
        char[] s = Reverse.toCharArray();
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.print(s[i]);
        }
    }
}