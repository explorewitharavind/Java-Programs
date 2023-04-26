import java.util.*;
public class PrimeNumbersRange 
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Enter Range");
        int Number = scanf.nextInt();
        int flag=0;
        for(int i=0;i<=Number;i++)
        {
            if(Number==1 || Number==0)
            continue;
            flag=1;
            for(int j=2;j<=i/2;j++)
            {
                
                if(i%j==0)
                {
                    flag = 0;
                    break;
                }
                    
            }
            if(flag==1)
            {
                System.out.println(i);
            }
        }
    }
}