import java.util.Scanner;

public class LeftPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height ");
        int Height = sc.nextInt();
        for(int i=1;i<=Height;i++)
        {
            for(int j=Height;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
