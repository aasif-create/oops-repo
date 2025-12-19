class BankAcc
{
    private int balance=1000;
    public int getBalance()
    {
        return balance;
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        System.out.println("GETTING THE BALANCE AMOUNT");
        BankAcc b = new BankAcc();
        System.out.println("AVAILABLE BALANCE IS :"+b.getBalance());

    }
}