package loansharking.model;

/**
 * A class representing a crime boss i.e.
 * a godfather to whom money is owed.
 * <p>
 * @author Markus J. Auvo 2019
 */
public class Godfather
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    private int ID;
    private String firstName;
    private String lastName;
    private String phone;
    private String turf;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public Godfather() {}

    public Godfather(int ID, String firstName, String lastName,
                        String phone, String turf) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.turf = turf;
    }
	
    // ------------------------------
    //  METHODS - Getters
    // ------------------------------
	
    public int getID() {
        return this.ID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getTurf() {
        return this.turf;
    }

    @Override
    public String toString() {
        String godfather = "";
        godfather += getFirstName().toUpperCase() + " " + getLastName().toUpperCase() + "\n";
        godfather += getTurf();
        godfather += getPhone();
        return godfather;
    }

    // ------------------------------
    //  METHODS - Setters
    // ------------------------------

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTurf(String turf) {
        this.turf = turf;
    }
}
