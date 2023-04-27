import java.util.Scanner;

public class MaximumNumberinAArray {
    static void Array(int[] arr)
    {
        int l = arr.length;
        int temp=0;
        for(int a = 0;a<l;a++)
        {
            for(int b=0;b<l;b++)
            {
                if(arr[a]<arr[b])
                {
                    temp = arr[a];
                    arr[a]=arr[b];
                    arr[b]=arr[a];
                }
            }
        }
        System.out.println("Maximum Number in a Array is = "+arr[0]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.println("Enter Numbers");
        for(int i=0;i<myArray.length;i++)
        {
            myArray[i]=sc.nextInt();
        }
        Array(myArray);
    }
}
