import java.util.Scanner;

public class ReverseStringWithInbuiltMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string !");
        String name = sc.nextLine();
        StringBuilder ob = new StringBuilder(name);
        System.out.println(ob.reverse());
        
    }
}
