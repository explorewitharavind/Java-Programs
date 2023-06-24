import java.util.Scanner;

public class ExtractAlfabetsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        char[] myArray = name.toCharArray();
        for(int i=0;i<=myArray.length-1;i++)
        {
            if('a'<= name.charAt(i) && name.charAt(i)<='z' || ('A' <=name.charAt(i) && name.charAt(i)<='Z'))
            {
                System.out.print(myArray[i]);
            }
        }
    }
}
