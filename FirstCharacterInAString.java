import java.util.Scanner;

public class FirstCharacterInAString {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name = scanf.nextLine();
        char Index = Name.charAt(0);
        System.out.println("Your Name Starts with Character " + Index);

    }
}
