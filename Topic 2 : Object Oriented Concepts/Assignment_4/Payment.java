/******************************************************************************

Define a class named Payment that contains a member variable of type double that stores the
amount of the payment and appropriate accessor and mutator methods. Also create a method
named paymentDetails that outputs an English sentence to describe the amount of the payment.

Next, define a class named CashPayment that is derived from Payment. This class should
redefine the paymentDetails method to indicate that the payment is in cash. Include appropriate
constructor(s).

Define a class named CreditCardPayment that is derived from Payment. This class should
contain member variables for the name on the card, expiration date, and credit card number.
Include appropriate constructor(s). Finally, redefine the paymentDetails method to include all
credit card information in the printout.
Create a main method that creates at least two CashPayment and two
CreditCardPayment objects with different values and calls paymentDetails for each.

*******************************************************************************/

public class Payment
{
    protected double cash;   // member variable that stores the amount of the payment
  
    Payment(double val)     // parameterized constructor
    {
       this.cash = Math.round (val * 100) / 100.0;
    }
    public double getcash()
    {
        return cash;
    }
    public void setcash(double newval)
    {
        this.cash = newval;
    }
    public void paymentDetails() // Method to outputs an English sentence to describe the amount of the payment
    {
        System.out.println("The payment of cash: Rs." + this.cash);
    }
}
