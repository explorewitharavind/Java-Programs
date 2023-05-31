import java.util.Scanner;

public class LeftPyramid {
    public static void main(String[] args) 
    {
        System.out.println("Enter the height of Pyramid ! ");
        Scanner sc = new Scanner(System.in);
        int Height = sc.nextInt();
        for(int i=Height;i>=1;i--)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        
    }
}
