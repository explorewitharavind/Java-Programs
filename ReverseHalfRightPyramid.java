import java.util.Scanner;

public class ReverseHalfRightPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height of Pyramid");
        int Height = sc.nextInt();
        for(int i =1;i<=Height;i++)
        {
            for(int j =Height;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
