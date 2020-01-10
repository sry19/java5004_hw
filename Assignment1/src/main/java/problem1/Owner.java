package problem1;

/**
 * Owner is a simple object that has a unique first name, last name and phone number.
 */
public class Owner {
    private String firstName;
    private String lastName;
    private String phoneNum;
    private int PHONE_LEN = 10;

    /**
     * Constructor that creates a new owner
     * @param firstName fist name of the owner
     * @param lastName last name of the owner
     * @param phoneNum phone number which has 10 characters
     */
    public Owner(String firstName,String lastName,String phoneNum){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = this.isValidPhoneNum(phoneNum);
    }

    /**
     * check if the phone number consists of 10 characters
     * @param phoneNum phone number consisting of 10 characters
     * @return phone number consisting of 10 characters
     */
    private String isValidPhoneNum(String phoneNum) {
        int len = phoneNum.length();
        if (len < PHONE_LEN) {
            int diff = PHONE_LEN - len;
            char[] inc = new char[diff];
            for (int i = 0;i < diff ; i++) {
                inc[i] = '0';
            }
            return String.valueOf(inc) + phoneNum;
        }
        else if (len > PHONE_LEN) {
            return phoneNum.substring(0,10);
        }
        else {
            return phoneNum;
        }
    }

    /**
     * return first name
     * @return first name
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * return last name
     * @return last name
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * return phone number
     * @return phone number
     */
    public String getPhoneNum() {
        return this.phoneNum;
    }
}
