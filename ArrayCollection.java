import java.util.Scanner;

public class ArrayCollection {
    public static void main(String[] args) {
        int Number;
        Scanner sc = new Scanner(System.in);
        System.out.println("How Many Number you want to Strore in an Array");
        Number = sc.nextInt();
        int[] Array0 = new int[10];
        System.out.println("Enter the Numbers into the array");
        for (int i = 0; i < Number; i++) {
            Array0[i] = sc.nextInt();
        }
        System.out.println("You Entered");
        for (int i = 0; i < Number; i++) {
            System.out.println(Array0[i]);
        }
    }
}