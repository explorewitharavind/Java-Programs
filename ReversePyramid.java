import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Height;
        System.out.println("Enter the Height of Pyramid");
        Height = sc.nextInt();
        for (int i = Height; i >= 1; --i) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" * ");

            }
            System.out.println(" ");
        }
    }
}