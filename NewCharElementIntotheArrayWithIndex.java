import java.util.Scanner;

public class NewCharElementIntotheArrayWithIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the String!");
        int size = sc.nextInt();
        char[] myArray = new char[size];
        char[] mychar = new char[size+1];
        System.out.println("Enter the values into the array!");
        for(int i=0;i<=size-1;i++)
        {
            myArray[i] = sc.next().charAt(0);
            mychar[i] = myArray[i];
        }
        System.out.println("Enter the index you want to enter new value !");
        int index = sc.nextInt();
        System.out.println("Enter the character you want to replace !");
        char nc = sc.next().charAt(0);
        System.out.println("final Array is :");
        for(int i=0;i<=size;i++)
        {
            if(index==i)
            {
                mychar[i] = nc;
                System.out.println(mychar[i]);
                for(int j = index+1 ;j<=size;j++)
                {
                    mychar[j] = myArray[j-1];
                }
            }
            else
            {
            System.out.println(mychar[i]);
            }
        }
    }
}
