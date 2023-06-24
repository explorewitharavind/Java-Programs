import java.util.Scanner;

public class IntialLetterCapitalInStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        String Initial = name.substring(0, 1);
        System.out.println(Initial.toUpperCase()+name.substring(1, name.length()).toLowerCase());
    }
}
