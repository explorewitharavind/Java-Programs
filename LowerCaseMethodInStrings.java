import java.util.Scanner;

public class LowerCaseMethodInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strng!");
        String name = sc.nextLine();
        System.out.println("Converting to Lowercase : "+name.toLowerCase());
    }
}
