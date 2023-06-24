import java.util.Scanner;

public class PrintAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string !");
        String name = sc.nextLine();
        StringBuilder ob = new StringBuilder(name);
        System.out.println(ob);
    }
}
