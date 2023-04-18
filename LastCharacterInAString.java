import java.util.Scanner;

public class LastCharacterInAString {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter your Name");
        String Name = scanf.nextLine();
        char Index = Name.charAt(Name.length() - 1);
        System.out.println("Your Name Ends with Character " + Index);

    }
}
