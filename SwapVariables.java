import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        int FirstNumber;
        int SecondNumber;
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter the FirstNumber");
        FirstNumber = scanf.nextInt();
        System.out.println("Enter the SecondNumber");
        SecondNumber = scanf.nextInt();
        System.out.println("Before Swaping " + FirstNumber + " " + SecondNumber);
        int Swap;
        Swap = FirstNumber;
        FirstNumber = SecondNumber;
        SecondNumber = Swap;
        System.out.println("After Swaping " + FirstNumber + " " + SecondNumber);

    }
}
