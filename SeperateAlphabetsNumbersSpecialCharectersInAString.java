import java.util.Scanner;

public class SeperateAlphabetsNumbersSpecialCharectersInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String !");
        String name = sc.nextLine();
        char[] mychar = name.toCharArray();
        String Alfabet = "";
        String Number = "";
        String Special = "";
        for(int i=0;i<=mychar.length-1;i++)
        {
            if(mychar[i]>='a' && 'z'>=mychar[i] || mychar[i]>='A' && 'Z'>=mychar[i])
            {
                Alfabet = Alfabet+mychar[i];
            }
           else if(mychar[i]>='0' && '9'>=mychar[i])
            {
                Number = Number+mychar[i];
            }
            else
            {
                Special = Special+mychar[i];
            } 
        }
        System.out.println(Alfabet);
        System.out.println(Number);
        System.out.println(Special);
    }
}
