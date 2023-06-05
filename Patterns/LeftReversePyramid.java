import java.util.Scanner;

public class LeftReversePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height ");
        int Height = sc.nextInt();
        for(int i=1;i<=Height;i++)
        {
            for(int space=1;space<=i;space++)
            {
                System.err.print(" ");
            }
            for(int j=Height;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
