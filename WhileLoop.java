import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int Number;
        System.out.println("How many Line you want to print");
        Number = ob.nextInt();
        do {
            System.out.println("Line" + Number);
            Number--;
        } while (Number >= 1);
    }
}
