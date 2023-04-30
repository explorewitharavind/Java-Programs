public class SortingArray
{
    public void DemoArray()
    {
        int[] myArray = {-2,-34,-4353,1,4543,56365,674,23,5,0};
        Sorting(myArray);
    }
    public void Sorting(int[] arr)
    {
        int l = arr.length;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp  = 0;
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
            
        }
    }
    public static void main(String[] args) 
    { 
        SortingArray ob = new SortingArray();
        ob.DemoArray();
        
    }
}