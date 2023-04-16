import java.util.Scanner;

public class RightPyramid {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int Height;
        System.out.println("Enter the Height of Pyramid");
        Height = ob.nextInt();
        for (int i = 1; i <= Height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }

    }
}
