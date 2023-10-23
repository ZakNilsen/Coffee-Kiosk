/**
 * Class determines money and how it is formatted in cents, but is still represented in 
 * normal fashion for customer to understand. Methods are important in calculating costs
 * and totals in other classes.
 * @author zaknilsen
 *
 */
public class Money {
    //similar to rational class
    /** Constant that is equivalent to zero dollars  */
    public static final Money ZERO = new Money(0);
    /** Constant that is equivalent to one dollar */
    public static final Money ONE_DOLLAR = new Money(100);
    /** Constant that is equivalent to two dollars */
    public static final Money TWO_DOLLARS = new Money(200);
    /** Is int that determines amount that is had */
    private int amountInCents;
    
    //need constructor that takes cents
    public Money(int cents) {
        amountInCents = cents;
    }
    
    /**
     * Calculates tax of money amount that is sent in
     * @param other money object that is sent in to calculate
     * @return Money total of just the tax
     */
    //may have to use math round method as Minnesota rounds to nearest cent
    public static Money computeMNSalesTax(Money other)  {
        double tax;
        int round;
        tax = (other.amountInCents * .06875);
        round = (int) Math.round(tax);
        return new Money(round);
    }
    
    /**
     * Adds two Money objects together
     * @param other Money object that is sent in
     * @return Money total price of added Money objects
     */
    public Money add(Money other) {
        return new Money(other.amountInCents + this.amountInCents);
    }
    
    /**
     * Subtracts two Money objects
     * @param other Money object that is sent in to be subtracted
     * @return Money which is total price after Money is subtracted from other
     */
    public Money subtract(Money other) {
        return new Money(this.amountInCents - other.amountInCents);
    }
    
    /**
     * Represent Money in normal fashion, rather than in cents
     * @return String of Money represented in dollar.cents style
     */
    public String toString() {
        String finalString =  "$";
        int dollar;
        int remainder;
        dollar = amountInCents / 100;
        remainder = amountInCents % 100;
        if (remainder < 10) {
            finalString = finalString + dollar + "." + "0" + remainder;
        } else {
            finalString = finalString + dollar + "." + remainder;
        } 
        
        return finalString;
    }

}
