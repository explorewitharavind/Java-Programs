import java.util.*;
public class SimpleCalculator
{
    public static void main(String[] args) 
    {
        System.out.println("**************************");
        System.out.println("      WELCOME TO");
        System.out.println("   SIMPLE CALCULATOR ");
        System.out.println("**************************");
        System.out.println(" Operation ");
            System.out.println("   "+(char)4+" 1.Addition");
            System.out.println("   "+(char)4+" 2.Substraction");
            System.out.println("   "+(char)4+" 3.Multiplication");
            System.out.println("   "+(char)4+" 4.Division");
            System.out.println("   "+(char)4+" 5.Modulas");
            System.out.println("Choose the above Options");
            Scanner sc = new Scanner(System.in);
            int Operations = sc.nextInt();
            switch(Operations)
            {
                case 1:
                {
                    System.out.println("You Have Choosen Addition");
                    System.out.println("How many Number you want to Add");
                    int range = sc.nextInt();
                    int sum=0;
                    for(int i=1;i<=range;i++)
                    {
                        System.out.println("Enter a Number");
                        int add = sc.nextInt();
                        sum = sum+add;
                    }
                    System.out.println("Addition of all Numbers is "+sum);
                }
                break;
                case 2 :
                {
                    System.out.println("You Have Choosen Subtraction");
                    System.out.println("Enter First Number ");
                    int First_Number = sc.nextInt();
                    System.out.println("Enter First Number ");
                    int Second_Number = sc.nextInt();
                    int sub=0;
                    sub = First_Number-Second_Number;
                    System.out.println("Subtraction of Two Numbers is : "+sub);
                }
                break;
                case 3:
                {
                    System.out.println("You Have Choosen Multiplication");
                    System.out.println("How many Number you want to Multiply");
                    int range = sc.nextInt();
                    int mul=1;
                    for(int i=1;i<=range;i++)
                    {
                        System.out.println("Enter a Number");
                        int num = sc.nextInt();
                        mul = mul*num;
                    }
                    System.out.println("Multiplicaation of all Numbers is "+mul);

                }
                break;
                case 4 :
                {
                    System.out.println("You Have Choosen Division");
                    System.out.println("Enter First Number ");
                    int First_Number = sc.nextInt();
                    System.out.println("Enter First Number ");
                    int Second_Number = sc.nextInt();
                    int div=0;
                    div = First_Number/Second_Number;
                    System.out.println("Division of Two Numbers is : "+div);
                }
                break;
                case 5:
                {
                    System.out.println("You Have Choosen Division");
                    System.out.println("Enter First Number ");
                    int First_Number = sc.nextInt();
                    System.out.println("Enter First Number ");
                    int Second_Number = sc.nextInt();
                    int mod=0;
                    mod = First_Number%Second_Number;
                    System.out.println("Modulas of Two Numbers is : "+mod);
                }
                break;
                default : {
                    System.out.println("Please Enter Valid Input");
                        }

            }
            System.out.println("Thank you for using Calculator");
    }
}
