import java.util.Scanner;

public class StringIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        char[] myArray = name.toCharArray();
        char[] mychar = new char[myArray.length];
        for(int i=0;i<=myArray.length-1;i++)
        {
            mychar[mychar.length-1-i] = myArray[i];
        }
        int count = 0;
        for(int i=0;i<=myArray.length-1;i++)
        {
            if(myArray[i]==mychar[i])
            {
                count++;
            }
        }
        if(count==name.length())
        {
            System.out.println(name+" is Palindrome");
        }
        else
        {
            System.out.println(name+" is not Palindrome!");
        }
    }
}
