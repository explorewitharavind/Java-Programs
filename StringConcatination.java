import java.util.Scanner;

public class StringConcatination {
    public static void main(String[] args) {

        String FirstName, LastName;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter your First Name");
        FirstName = scanf.nextLine();
        System.out.println("Enter your Last Name");
        LastName = scanf.nextLine();
        System.out.println("Your Full Name = " + FirstName + " " + LastName);
    }
}