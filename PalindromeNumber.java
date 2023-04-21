import java.util.*;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter a Number to Check Palindrome Number");
        int Palindrome = scanf.nextInt();
        int temp = 0, sum = 0;
        temp = Palindrome;
        while (Palindrome > 0) {
            int r = Palindrome % 10;
            sum = (sum * 10) + r;
            Palindrome = Palindrome / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is a Palindrome Number");
        } else {
            System.out.println(temp + " is not a Palindrome Number");
        }
    }

}
