public class MovingZeroToEndingInArray
{
    public void PrintArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        
    }
     public void ArrayDemo()
    {
       int[] myArray = {0,1,0,2,0,3};
       PrintArray(myArray);
       MovingZeros(myArray);
       System.out.println();
       PrintArray(myArray);
    }
    public void MovingZeros(int[] arr)
    { int j=0;int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0 && arr[j]==0)
            {
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0)
            {
                j++;
            }
        }

    }

    public static void main(String[] args) {
        MovingZeroToEndingInArray obj = new MovingZeroToEndingInArray();
        obj.ArrayDemo();
    }
}