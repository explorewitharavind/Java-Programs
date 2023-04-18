import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] Array = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index of an Array To Get Value");
        int Indexx = sc.nextInt();
        System.out.print("The Value at " + Indexx + " Index is " + Array[Indexx]);
    }
}
