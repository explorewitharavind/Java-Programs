import java.util.*;
public class HypotenusOfTriangle {
    public static void main(String[] args) {
        System.out.println("Enter a side of a Triangle");
        Scanner scanf = new Scanner(System.in);
        int a = scanf.nextInt();
        System.out.println("Enter a side of a Triangle");
        int b = scanf.nextInt();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Square of the Triangle is "+c);

    }
}
