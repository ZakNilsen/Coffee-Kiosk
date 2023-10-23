import java.util.ArrayList;
/**
 * Is abstract class that implements Buyable that only sets the structure for objects that are
 * extended. Size is set here and drink additions are added into the addOns ArrayList, otherwise
 * getCost() and getCalories() are calculated in extended classes
 * @author zaknilsen
 *
 */
public abstract class Beverage implements Buyable {
    //abstract class
    /** Is constant for Large size Beverage */
    public static final int LARGE = 2;
    /** Is constant for Medium size Beverage */
    public static final int MEDIUM = 1;
    /** Is constant for Small size Beverage */
    public static final int SMALL = 0;
    /** Is ArrayList where SoyMilk and SugarSyrup additions are added */
    protected ArrayList<Addition> addOns;
    /** Determined size of drink */
    protected int size;
    
    public Beverage() { 
        addOns = new ArrayList<Addition>();
    }
    
    /**
     * Method determines price of beverage but price is calculated in that respective 
     * beverage class
     * @return Money price of beverage determined elsewhere
     */
    //abstract method, will  not be implemented here
    public abstract Money getCost();
    
    /**
     * Method determines total calories of beverage, but this is determined within that
     * beverage class
     * @return int of total calories, but this is determined elsewhere
     */
    public abstract int getCalories();
        
    
    /**
     * Sets size of beverage
     * @param size is taken in and determines size of beverage
     * 
     */
    public void setSize(int size) {
        this.size = size;
         
    }
    
    /**
     * Adds addOns like soy milk and sugar syrup to beverage if customer decides to add them
     * @param other adds Addition like SoyMilk or SugarSyrup to Beverage
     * 
     */
    public void addToDrink(Addition other) {
        addOns.add(other);
           
    }

}
