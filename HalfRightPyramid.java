import java.util.Scanner;

public class HalfRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height of Pyramid");
        int Height = sc.nextInt();
        for(int i=1;i<=Height;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
