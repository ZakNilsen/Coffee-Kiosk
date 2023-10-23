/**
 * Is Abstract class that has the main purpose of setting up getCost() and getCalories()
 * to be calculated in their own respective classes
 * @author zaknilsen
 *
 */
public abstract class Addition {
    
    /**
     * Determines price of Addition, but determined in own class
     * @return Money which will be price of Addition, but determined in own class
     */
    public abstract Money getCost();
        
    /**
     * Determines total calories of Addition, but determined in own class   
     * @return int which will be total calories, but determined in own class
     */
    public abstract int getCalories();  
        
    

}
