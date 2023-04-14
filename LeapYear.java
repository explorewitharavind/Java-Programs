import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int Leapyear;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        Leapyear = sc.nextInt();
        if (((Leapyear % 4 == 0) && (Leapyear % 100 != 0)) || (Leapyear % 400 == 0)) {
            System.out.println(Leapyear + "is Leap Year");
        } else {
            System.out.println(Leapyear + " is not a Leap Year");
        }
    }
}
