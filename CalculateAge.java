import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {
        System.out.println("=====> WELCOME TO AGE CALCULATOR <=====");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Present Year ");
        int Present_year = sc.nextInt();
        System.out.println("Enter Year of Birth ");
        int Birth_Year = sc.nextInt();
        int Current_Age = Present_year - Birth_Year;
        System.out.println("Your age is : "+Current_Age);

    }
}
