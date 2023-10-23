/**
 * Is object that can be added onto Beverage drink if customer decides so
 * @author zaknilsen
 *
 */
public class SoyMilk extends Addition {
    
    /**
     * Is cost of SoyMilk addition
     * @return Money returns price of SoyMilk when added to beverage
     */
    public Money getCost() {
        return new Money(100);
        
    }
    
    /**
     * Is amount of calories in SoyMilk that will be added to beverage if customer decides so
     * @return int number of calories in SoyMilk
     */
    public int getCalories() {
        return 80;
    }
    
    /**
     * Will add object to other beverage in a nice and easy manner for customer to understand 
     * @return String of object that will be printed for user to see
     */
    @Override
    public String toString() {
        String finalString = "";
        finalString = finalString + "+Soy";
        return finalString;
    }
}
