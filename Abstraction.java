interface ATM
{
    void withdraw(int amount);
}
class BankAcc implements ATM
{
    public void withdraw(int amount)
    {
        System.out.println("Checking account balance...");
        System.out.println("Connecting to bank server...");
        System.out.println("Processing withdrawal of Rs " + amount);
        System.out.println("Please collect your cash");
    }
}
public class Abstraction
{
    public static void main(String[] args)
    {
        ATM obj = new BankAcc();
         System.out.println("USER REQUESTS TO WITHDRAW Rs 1000");
        obj.withdraw(1000);
    }
}
/*
EXPLANATION:
1. ATM is an interface that defines the withdraw operation.
2. It does not show how the withdrawal is done.
3. BankAcc class provides the implementation of withdraw().
4. main() uses the ATM interface and does not know the logic inside the BankAcc class.
5. This hiding of BankAcc logic is called Abstraction.
*/
