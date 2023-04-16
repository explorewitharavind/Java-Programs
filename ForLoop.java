import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        int l;
        System.out.println("Enter a how many Numbers you want to Display");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        for (int i = 1; i <= l; i++) {
            System.out.println(i);

        }
    }
}