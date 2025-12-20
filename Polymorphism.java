class Payment
{
    public void pay()
    {
        System.out.println("PAYMENT PROCESS INITIALIZED");
    }
}
    class CashPayment extends Payment
    {
        @Override
        public void pay()
        {
            System.out.println("PAYMENT THROUGH CASH");
        }
    }
public class Polymorphism
{
    public static void main(String[] args)
    {
        Payment obj =new CashPayment();
        obj.pay();
    }
}
/*
EXPLANATION:
1. Payment is the parent class with the pay() method.
2. CashPayment is the child class with the same method name pay().
3. CashPayment inherits from Payment.
4. Payment reference points to a CashPayment object, so the method runs at runtime.
5. Same method showing different behavior is called Polymorphism.
 */