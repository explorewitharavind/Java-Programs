public class FindMissingNumberinNaturalNumbers {
    public void MissingNumber(int[] arr)
    { 
        int sum=0;
        int l =arr.length+1;
        sum = l*(l+1)/2;
        for(int n : arr)
        {
            sum = sum-n;
        }
        System.out.println(sum);
    }
    public void Array()
    {
        int myArray[] = {1,2,3,5,6,7,8,9};
        MissingNumber(myArray);
    }
    public static void main(String[] args) {
        FindMissingNumberinNaturalNumbers ob = new FindMissingNumberinNaturalNumbers();
        ob.Array();
    }
}
