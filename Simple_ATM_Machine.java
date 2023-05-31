import java.util.*;
public class Simple_ATM_Machine 
{
    public static void main(String[] args) 
    {
        System.out.println("-------> Welcome to the ATM <------- ");
        System.out.println("Insert Your Card");
        System.out.println("Enter Your Four Digit Pin");
        Scanner sc = new Scanner(System.in);
        int User_Pin = sc.nextInt();
        int Actual_pin = 1234;
        int Account_Balance = 1000;
        if(Actual_pin==User_Pin)
        {
            System.out.println("Select an Option ");
            System.out.println("     "+(char)4+" 1.Balance Enquiry ");
            System.out.println("     "+(char)4+" 2.Withdraw Money ");
            System.out.println("     "+(char)4+" 3.Deposit Money ");
            int Choice = sc.nextInt();
            switch(Choice)
            {
                case 1 :
                {
                    System.out.println("Please Enter a Number Between 10 and 99");
                    int Human_Verification = sc.nextInt();
                    if(Human_Verification>=10 && Human_Verification<=99)
                    {
                        System.out.println("Your Account Balance is : "+ Account_Balance);
                    }
                    else
                    {
                        System.out.println("You have Entered Incorrect Number");
                    }
                }
                break;
                case 2:
                {
                    System.out.println("Please Enter a Number Between 10 and 99");
                    int Human_Verification = sc.nextInt();
                    if(Human_Verification>=10 && Human_Verification<=99)
                    {
                        System.out.println("Enter Amount You Want To Withdraw ");
                        int Withdraw_Money = sc.nextInt();
                        if(Account_Balance>=Withdraw_Money && (Account_Balance-Withdraw_Money)>=0)
                        {
                        System.out.println("Withdraw Successfull Please collect Your Cash ");
                        System.out.println("Do you Want to Check Remaining Balance ?");
                        System.out.println("Type 1 ");
                        int Remaining_Balance = sc.nextInt();
                        if(Remaining_Balance==1)
                        {
                            System.out.println("Remaining Balance is :"+(Account_Balance-Withdraw_Money));
                        }
                        }
                        else
                        {
                            System.out.println("You Dont Have Sufficent Balance to Withdraw");
                        }

                      }
                    else
                    {
                        System.out.println("You have Entered Incorrect Number");
                    }
                }
                break;
                case 3 :
                {
                    System.out.println("Please Enter a Number Between 10 and 99");
                    int Human_Verification = sc.nextInt();
                    if(Human_Verification>=10 && Human_Verification<=99)
                    {
                        System.out.println("Enter Amount You Want To Deposit ");
                        int Deposit_Money = sc.nextInt();
                        System.out.println("Succesfully Amount Deposited into the Account");
                        System.out.println("Do you Want to Check Remaining Balance ?");
                        System.out.println("Type 1 ");
                        int Remaining_Balance = sc.nextInt();
                        if(Remaining_Balance==1)
                        {
                            System.out.println("Remaining Balance is :"+(Account_Balance+Deposit_Money));
                        }
                        
                    }
                }
                break;
            }
        }
        else
        {
            System.out.println("Please Enter Valid PIN");
        }
        System.out.println("Thank You For Using ATM");
    }    
}
