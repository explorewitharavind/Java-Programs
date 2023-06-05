import java.util.Scanner;

public class RightFullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Height ");
        int Height = sc.nextInt();
        for(int i =1;i<=2*Height+1;i++)
        {
            int Logic = i>Height? 2*Height-i:i;
            for(int j=1;j<=Logic;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
