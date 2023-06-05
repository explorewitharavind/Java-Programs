import java.util.*;
public class Reverse_Triangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        int height = sc.nextInt();
        for(int i=1;i<=height;i++)
        {
            for(int space = 1;space<=i;space++)
            {
                System.out.print(" ");
            }
            for(int j=height;j>=i;j--)
            {
                System.out.print("* ");
            }  
            System.out.println();  
        }
    }
}



