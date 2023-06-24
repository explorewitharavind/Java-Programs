import java.util.Scanner;

public class ReverseAStringWithoutChangingPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        String[] myStrings = name.split(" ");
        for(int i=0;i<=myStrings.length-1;i++)
        {
            StringBuilder ob = new StringBuilder(myStrings[i]);
            System.out.print(ob.reverse()+" ");
        }
    }
}
