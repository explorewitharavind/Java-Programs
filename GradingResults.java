import java.util.Scanner;

public class GradingResults 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your Marks!");
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();
        switch(Marks/10)
        {
            case 10:
            case 9:
            {
                System.out.println("S Grade");
            }
            break;
            case 8 :
            {
                System.out.println("A Grade");
            }
            break;
            case 7:
            {
                System.out.println("B Grade");
            }
            break;
            case 6:
            {
                System.out.println("C Grade");
            }
            break;
            case 5:
            {
                System.out.println("D Grade");
            }
            break;
            case 4:case 3: case 2: case 1: case 0:
            {
                System.out.println("Failed");
            }
            break;
            default: System.out.println("Please enter Valid Marks");
            break;
        }
        
    }
}
