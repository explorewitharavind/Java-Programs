public class RecursionPrintingNumbers {
    public static void main(String[] args) {
        Number();
    }
    static void Number()
    {
        Loop();
    }
    static void Loop()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
}
