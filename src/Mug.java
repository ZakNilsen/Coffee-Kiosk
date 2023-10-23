/**
 * This class sets up mug object and determines price and sets toString so that it is neat
 * and representable to customer
 * @author zaknilsen
 *
 */
public class Mug implements Buyable  {
    
    /**
     * Gets cost of mug
     * @return Money which is price of Mug
     */
    public Money getCost() {
        return new Money(500);
        
    }
    
    /**
     * Makes class representable and neat for customer to understand
     * @return String of object presented in neat form for customer
     */
    @Override
    public String toString() {
        String finalString = "";
        finalString = finalString + "Classy Mug";
        return finalString;
    }

}
