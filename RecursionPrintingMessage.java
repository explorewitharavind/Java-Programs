public class RecursionPrintingMessage {
    public static void main(String[] args) {
        Loop();
    }
    static void Message()
    {
        System.out.println("Hello World");
    }
    static void Loop()
    {
        for(int i=1;i<=5;i++)
        {
            Message();
        }
    }
}
