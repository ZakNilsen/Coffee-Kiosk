/**
 * Is extension of beverage that creates new tea object for person to order from kiosk with
 * any addition or size they would like, in which price and calories will be calculated by 
 * whatever customer chose.
 * @author zaknilsen
 *
 */
public class Tea extends Beverage {
    
    /**
     * Calculates cost of whatever size coffee and with whatever decided add-ons
     * @return Money object that will be calculate price and then be sent to shopping cart to order
     */
    public Money getCost() {
        Money money = new Money(150);
        
        for (int i = 0; i < addOns.size(); i++) {
            money = money.add(addOns.get(i).getCost());
            
        }
        return money;
    }
    
    /**
     * Calculates total amount of calories as int taking into account customers preference
     * of size and add-ons
     * 
     * @return int which will be number of calories in the drink accounting for size and add-ons
     */
    public int getCalories() {
        int calories = 5;
        //need to account for soy milk and sugar syrup
        for (int i = 0; i < addOns.size(); i++) {
            calories = calories + addOns.get(i).getCalories();
            
        }
        return calories;
    }
    
    /**
     * Will print Tea object in a nice and easy manner for customer to understand 
     * @return String of object that will be printed for user to see
     */
    @Override
    public String toString() {
        //need to account for addOns
        String finalString = "";
        String finalSize = "";
        String addition = "";
        for (int i = 0; i < addOns.size(); i++) {
            addition = addition + addOns.get(i).toString();
        }
        
        if (size == 0) {
            finalSize = finalSize + "Small";
        } else if (size == 1) {
            finalSize = finalSize + "Medium";
        } else {
            finalSize = finalSize + "Large";
        }
        finalString = finalString + finalSize + " Tea" + addition + " (" + getCalories() + " calories)";
        return finalString;
    }

}
