package loansharking.model;

/**
 * A class representing a customer, i.e.
 * the debt payer, the unfortunate individual.
 * <p>
 * @author Markus J. Auvo 2019
 */
public class Customer
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    private int ID;
    private String fName;
    private String lName;
    private String street;
    private int zipcode;
    private String city;
    private String phone;
    private String email;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public Customer() {}

    /**
     * 
     * @param ID
     * @param fName
     * @param lName
     * @param street
     * @param zipcode
     * @param city
     * @param phone
     * @param email 
     */
    public Customer(int ID, String fName, String lName,
                    String street, int zipcode, String city, String phone, String email) {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.phone = phone;
        this.email = email;
    }

    // ------------------------------
    //  METHODS - Getters
    // ------------------------------

    public int getID() {
        return this.ID;
    }

    public String getFName() {
        return this.fName;
    }

    public String getLName() {
        return this.lName;
    }

    public String getStreet() {
        return this.street;
    }

    public int getZipCode() {
        return this.zipcode;
    }

    public String getCity() {
        return this.city;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        String customer = "";
        customer += this.getFName().toUpperCase() + " " + this.getLName().toUpperCase() + " ";
        customer += "(" + this.getID() + ")\n";
        customer += "\n";
        customer += this.getStreet() + "\n";
        customer += this.getZipCode() + " " + this.getCity() + "\n";
        customer += "\n";
        customer += getPhone() + "\n";
        customer += getEmail() + "\n";
        return customer;
    }

    // ------------------------------
    //  METHODS - Setters
    // ------------------------------

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
