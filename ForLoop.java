import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        System.out.println("How many times you want to print ");
        int Times = sc.nextInt();
        int count=1;
        int i=1;
        while(i<=Times)
        {
            count++;
            System.out.println(count+". My name is "+Name);
            i++;

        }
    }
}
