import java.util.Scanner;
import java.math.*;

public class AreaAndPerimeterOfCircle {
    public static void main(String[] args) {
        double Radius;
        try (Scanner scanf = new Scanner(System.in)) {
            System.out.println("Enter the Radius of Circle");
            Radius = scanf.nextDouble();
        }
        double AreaOfCircle, PerimeterOfCircle;
        AreaOfCircle = Math.PI * Radius * Radius;
        System.out.println("Area of the Circle is " + AreaOfCircle);
        PerimeterOfCircle = 2 * Math.PI * Radius;
        System.out.println("Perimeter of the Circle is " + PerimeterOfCircle);
    }
}
