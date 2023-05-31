import java.util.Scanner;

public class NaturalNumbersReverse {
    public static void main(String[] args) {
        System.out.println("Enter the Range of Natural Number");
        Scanner sc = new Scanner(System.in);
        int Range = sc.nextInt();
        for(int i=Range;i>=1;i--)
        {
            System.out.println(i);
        }
    }
}
