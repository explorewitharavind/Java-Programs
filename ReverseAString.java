import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String !");
        String name = sc.nextLine();
        char[] mychar = name.toCharArray();
        for(int i=mychar.length-1;i>=0;i--)
        {
            System.out.print(mychar[i]);
        }
    }
}
