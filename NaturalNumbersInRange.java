import java.util.Scanner;

public class NaturalNumbersInRange {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
       System.out.println("Enter the minimum Range");
       int Min_Range = sc.nextInt(); 
       System.out.println("Enter Maximum Range");
       int Max_Range = sc.nextInt();
       for(int i = Min_Range;i<=Max_Range;i++)
       {
        System.out.println(i);
       }
    }
}
