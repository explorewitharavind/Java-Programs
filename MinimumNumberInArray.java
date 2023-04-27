import java.util.Scanner;

public class MinimumNumberInArray {
    static void Array(int[] arr)
    {
        int n = arr.length;
        
        for(int i=0;i<n;i++)
        {
            int temp=0;
           for (int k=i+1;k<n;k++)
           { 
            
               if(arr[i]>arr[k])
               { 
                temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
               }
               
           }
        }
        System.out.println("The Minumum Number is "+arr[0]);
        
    }
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        int[] myArray = new int[5];
        System.out.println("Enter any 5 Numbers");
        for(int j=0;j<myArray.length;j++)
        {
            myArray[j]=scanf.nextInt();
        }
        Array(myArray);
        
    }
}
