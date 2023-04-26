import java.util.*;
public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int LastNumber ;
        int s = 0;
        System.out.println("Ente the Last Number to add all Previous Odd Numbers");
        LastNumber = scanf.nextInt();
        for(int i=0;i<=LastNumber;i++)
        {
            if(i%2!=0)
            {
            s = s+i;
            }
            
        }
        
        System.out.println(s);
    }
}
