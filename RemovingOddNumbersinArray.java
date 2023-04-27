import java.util.Scanner;

public class RemovingOddNumbersinArray {
    static void Array(int[] Array)
    {
        int n = Array.length;
        for(int i=0;i<n;i++)
        {
            if(Array[i]%2==0)
            {
                System.out.print("Even Numbers are ");
                System.out.println(+Array[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] myArray = new int[5];
        System.out.println("Enter 5 Numbers");
        Scanner sc = new Scanner(System.in);
        for(int j=0;j<myArray.length;j++)
        {   
            myArray[j]=sc.nextInt();
        }

        Array(myArray);
    }
}
