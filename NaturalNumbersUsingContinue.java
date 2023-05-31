import java.util.Scanner;

public class NaturalNumbersUsingContinue {
    public static void main(String[] args) {
        System.out.println("Enter the Range of Natural Number");
        Scanner sc = new Scanner(System.in);
        int Range = sc.nextInt();
        int i=1;
        while(i<=Range)
        {
            if(i!=5)
            {
                continue;
            }
            System.out.println(i);
            i++;    
        }
    }
}
