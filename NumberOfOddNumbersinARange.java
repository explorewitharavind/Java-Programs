import java.util.*;
public class NumberOfOddNumbersinARange {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter Last Number to find Total Odd Numbers Before This Number");
        int Last = scanf.nextInt();
        int count =0;
        for(int i=0;i<=Last;i++)
        {
            if(i%2!=0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
