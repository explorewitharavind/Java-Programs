import java.util.Scanner;

public class StringReader {
    public static void main(String[] args) {
        String StringValue;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter any String");
        StringValue = scanf.nextLine();
        System.out.println("Entered String = " + StringValue);
    }
}