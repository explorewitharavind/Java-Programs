public class OperationsUsingMethods {
    static void Addition(int x,int y)
    {
        x=2;y=3;
        System.out.print("Addition = ");
        System.out.println(x+y);
        
    }
    static void Subtraction(int x,int y)
    {
        x=2;y=3;
        System.out.print("Subtraction = ");
        System.out.println(x-y);
    }
    static void Multiplication(int x,int y)
    {
        x=2;y=3;
        System.out.print("Multiplication = ");
        System.out.println(x*y);
    }
    public static void main(String[] args) {
       Addition(0, 0);
        Subtraction(0, 0);
        Multiplication(0, 0);
    }
}
