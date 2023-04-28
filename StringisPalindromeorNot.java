

public class StringisPalindromeorNot {

    public boolean Sstring(String word)
    {  
        char[] myChar = word.toCharArray();
        int start = 0;
        int end = myChar.length-1;
        while(start<end)
        {
            if(myChar[start]!=myChar[end])
            {
            return false;
            }
            start++;
            end--;
            }
        return true;
            
        }
        
    public static void main(String[] args) {
        StringisPalindromeorNot ob = new StringisPalindromeorNot();
        if(ob.Sstring("12321"))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }
}    


