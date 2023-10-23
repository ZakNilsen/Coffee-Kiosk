/**
 * Is extension of beverage that creates new coffee object for person to order from kiosk with
 * any addition, size or to choose whether they want decaf or not, in which price and calories
 *  will be calculated by whatever customer choose.
 * @author zaknilsen
 *
 */
public class Coffee extends Beverage  {
    /** Is boolean that determines whether coffee is decaf or not */
    private boolean isDecaf;
    
    public Coffee(boolean isDecaf) {
        this.isDecaf = isDecaf;
        
    }
    
    /**
     * Calculates cost of whatever size coffee and with whatever decided add-ons
     * @return Money object that will calculate price and then be sent to shopping cart to order
     */
    public Money getCost() {
        Money money = new Money(0);
        if (size  == SMALL) {
            money = new Money(150);
        } else if (size == MEDIUM) {
            money = new Money(200);
        } else {
            money = new Money(250);
        }

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
        int calories;
        if (size  == SMALL) {
            calories = 5;
        } else if (size == MEDIUM) {
            calories = 10;
        } else {
            calories = 15;
        }
        
        for (int i = 0; i < addOns.size(); i++) {
            calories = calories + addOns.get(i).getCalories();
            
        }
        //need to account for soy milk and sugar syrup
        return calories;
    }
    /**
     * Will print Coffee object in a nice and easy manner for customer to understand 
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
        //need to add soy and sugar syrup to string
        if (isDecaf == false) {
            finalString = finalString + finalSize + " Coffee" + addition + " (" + getCalories() + " calories)";
        } else {
            finalString = finalString + finalSize + " Decaf Coffee" + addition + " (" + getCalories() + " calories)";
        }
        return finalString;
    }

}
