import java.util.Scanner;

public class SandGlassTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int Height = sc.nextInt();
        for(int i=1;i<=Height;i++)
        {
            for(int space = 1;space<=i;space++)
            {
                System.out.print(" ");
            }
            for(int j=Height;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1;i<=Height;i++)
        {
            for(int space = Height;space>=i;space--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
}
