import java.util.ArrayList;
/**
 * This class is where all the objects that the customer ordered get sent for them to buy
 * in where all the objects can neatly be displayed to user, and total price with tax will be known
 * @author zaknilsen
 *
 */
public class ShoppingCart {
    /** ArrayList of Buyable objects where all objects that customer can order are stored */
    private ArrayList<Buyable> items;
    // empty shopping-cart should not crash program and should show something
    public ShoppingCart()  {
        items = new ArrayList<Buyable>();
    }
    /**
     * Takes in item that will be added to shopping cart ArrayList
     * @param item that will be added to ArrayList
     * 
     */
    public void addItem(Buyable item) {
        items.add(item);
        
    }
    /**
     * Will calculate the total price of what customer ordered including the tax
     * @return Money object that is total price of customers order including tax
     */
    //will have to add tax and total amount in dollars here
    public Money getTotal()  {
        Money money = new Money(0);
        Money tax = new Money(0);
        
        for (int i = 0; i < items.size(); i++) {
            money = money.add(items.get(i).getCost());
            
        }
        tax = Money.computeMNSalesTax(money);
        money = money.add(tax);
        return money;
    }
    
    /**
     * Presents string of all items in shopping cart, with price and grand total in neat
     * and orderly fashion so that it is easy for customer to understand
     * @return String of all items in shopping cart and total
     */
    @Override
    public String toString() {
        String finalString = "";
        if (items.size() == 0) {
            return "Nothing in your shopping cart";
        }
        for (int i = 0; i < items.size(); i++) {
            finalString = finalString + (i+1) + ".  ) " + items.get(i).toString() + ": "+ items.get(i).getCost().toString()  + "\n";
            
        }
        finalString = finalString + "Total: " + getTotal();
        return finalString;
    }

} 
