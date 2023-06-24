import java.util.Scanner;

public class UpperCaseMethodInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        System.out.print("Converting to UpperCase :");
        System.out.print(name.toUpperCase());
    }
}
