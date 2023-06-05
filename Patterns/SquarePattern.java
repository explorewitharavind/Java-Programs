import java.util.Scanner;
public class SquarePattern
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the Square");
        int Side = sc.nextInt();
        for(int i=1;i<=Side;i++)
        {
            for(int j=1;j<=Side;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}