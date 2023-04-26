import java.util.*;
public class OddNumbersRange {
    public static void main(String[] args) {
        int FinalNumber;
        System.out.println("Enter Last Number To Find Previous Odd Numbers");
        Scanner sc = new Scanner(System.in);
        FinalNumber = sc.nextInt();
        System.out.println("Odd Numbers are ");
        for(int i=0;i<=FinalNumber;i++)
        {
            if(i%2!=0)
            {
            System.out.println(i);
            }
        }
            
    }
}
