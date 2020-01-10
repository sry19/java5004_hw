package problem3;

/**
 * Amount is a simple object that has a dollar counter and a cent counter.
 */
public class Amount {
    private int dollars;
    private int cents;
    private int maxVal = 99;
    private int minVal = 0;

    /**
     * Constructor that creates an amount
     * @param dollars count the number of dollars
     * @param cents count the number of cents
     */
    public Amount(int dollars,int cents){
        this.dollars = this.isValidDollars(dollars);
        this.cents = this.isValidCents(cents);
    }

    /**
     * return the number of dollars
     * @return the number of dollars
     */
    public int getDollars() {
        return this.dollars;
    }

    /**
     * return the number of cents
     * @return the number of cents
     */
    public int getCents() {
        return this.cents;
    }

    /**
     * check if the number of dollars is valid
     * @param dollars the number of dollars
     * @return the number of dollars
     */
    private int isValidDollars(int dollars) {
        if (dollars < minVal) {
            return minVal;
        }
        else{
            return dollars;
        }
    }

    /**
     * check if the number of cents is valid
     * @param cents the number of cents
     * @return the number of cents
     */
    private int isValidCents(int cents) {
        if (cents >= minVal && cents <= maxVal) {
            return cents;
        }
        else if (cents < minVal) {
            return minVal;
        }
        else {
            this.dollars = this.dollars+ cents /(maxVal+1);
            return cents % (maxVal + 1);
        }
    }
}
