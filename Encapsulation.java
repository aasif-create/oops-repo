class BankAcc
{
    private final int balance = 1000;
    public int getBalance()
    {
        return balance;
    }}
public class Encapsulation
{
    public static void main(String[] args)
    {
        System.out.println("GETTING THE BALANCE AMOUNT");
        BankAcc b = new BankAcc();
        System.out.println("AVAILABLE BALANCE IS : " + b.getBalance());
    }}
/*
EXPLANATION:
1. 'balance' is kept private, so it cannot be accessed directly.
2. 'getBalance()' is used to access the private variable safely.
3. data[balance] and method[getBalance()] are bound together inside one class.
4. This binding and protection of data is called Encapsulation.
*/