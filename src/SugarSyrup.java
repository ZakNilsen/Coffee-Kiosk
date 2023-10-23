/**
 * Is object that can be added onto Beverage drink if customer decides so
 * @author zaknilsen
 *
 */
public class SugarSyrup extends Addition {
    
    /**
     * Is cost of SugarSyrup addition
     * @return Money returns price of Sugar Syrup when added to beverage
     */
    public Money getCost() {
        return new Money(50);
    }
    
    /**
     * Is amount of calories in Sugar Syrup that will be added to beverage if customer decides so
     * @return int number of calories in SugarSyrup
     */
    public int getCalories() {
        return 60;
    }
    
    /**
     * Will add object to other beverage in a nice and easy manner for customer to understand 
     * @return String of object that will be printed for user to see
     */
    @Override
    public String toString() {
        String finalString = "";
        finalString = finalString + "+Sugar Syrup";
        return finalString;
    }

}
