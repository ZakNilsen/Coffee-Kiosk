/**
 * Is interface that sets getCost() for all other classes that require it
 * @author zaknilsen
 *
 */
public interface Buyable {
    /**
     * Gets the cost of certain object 
     * @return Money price of object
     */
    Money getCost();
       
}
