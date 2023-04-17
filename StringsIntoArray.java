import java.util.Scanner;

public class StringsIntoArray {
    public static void main(String[] args) {
        int Number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter How Many No of Strings Do You Want to Enter");
        Number = sc.nextInt();
        String[] Array = new String[100];
        System.out.println("Enter your String values");
        for (int i = 0; i <= Number; i++) {
            Array[i] = sc.nextLine();
        }
        System.out.println("Entered String = ");
        for (int i = 0; i <= Number; i++) {
            System.out.println(Array[i]);
        }
    }
}
