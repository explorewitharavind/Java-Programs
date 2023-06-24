import java.util.Scanner;

public class DoubleArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array!");
        int size = sc.nextInt();
        double[] myArray = new double[size];
        System.out.println("Enter the values !");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.nextDouble();
        }
        System.out.println("Printing final Array!");
        for(int i=0;i<=size-1;i++)
        {
            System.out.println(myArray[i]);
        }
    }
}
