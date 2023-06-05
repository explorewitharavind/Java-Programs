import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hight of Pyramid");
        int Hight = sc.nextInt();
        for(int i=1;i<=Hight;i++)
        {
            for(int space = i;space<=5;space++)
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
