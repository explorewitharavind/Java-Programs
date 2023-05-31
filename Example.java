import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        System.out.println("Enter the Range of Natural Number");
        Scanner sc = new Scanner(System.in);
        int Range = sc.nextInt();
        for(int i=1;i<=Range;i++)
        {
            if(i!=5)
            {
                System.out.println(i);
            }
            
            
        }
    }
}
