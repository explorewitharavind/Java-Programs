import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Range of Natural Number");
        Scanner sc = new Scanner(System.in);
        int Range = sc.nextInt();
        for(int i=1;i<=Range;i++)
        {
            System.out.println(i);
        }
    }
}
