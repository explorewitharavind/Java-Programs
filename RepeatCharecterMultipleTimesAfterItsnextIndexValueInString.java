import java.util.Scanner;

public class RepeatCharecterMultipleTimesAfterItsnextIndexValueInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String name = sc.nextLine();
        char[] mychar = name.toCharArray();
        for(int i=0;i<=mychar.length-1;i++)
        {
           if(i%2==0)
           {
            int repeat = Character.getNumericValue(mychar[i+1]);
            for(int j=1;j<=repeat;j++)
            {
                System.out.print(mychar[i]);
            }
           }
        }
    }
}
