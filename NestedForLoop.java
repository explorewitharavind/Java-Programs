import java.util.Scanner;

public class NestedForLoop {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int OuterLoop, InnerLoop;
        System.out.println("Enter Number of OuterLoops");
        OuterLoop = scanf.nextInt();
        System.out.println("Enter Number of InnerLoop");
        InnerLoop = scanf.nextInt();
        for (int i = 1; i <= OuterLoop; ++i) {
            System.out.println("OuterLoop");
            for (int j = 1; j <= InnerLoop; ++j) {
                System.out.println(" Inner Loop");
            }
        }
    }
}