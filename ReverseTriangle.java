import java.util.Scanner;

public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height");
        int Height = sc.nextInt();
        for(int i=1;i<=Height;i++)
        {
            for(int j=1;j<=Height-i+1;j++)
            {
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
}
