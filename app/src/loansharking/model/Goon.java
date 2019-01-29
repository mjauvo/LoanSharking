package loansharking.model;

/**
 * A class representing a goon, i.e.
 * a person who ensures that the debt is paid....
 */
public class Goon
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    private int ID;
    private String fName;
    private String lName;
    private String nickName;
    private String phone;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public Goon(int ID, String fName, String lName, String nickName, String phone) {
        this.ID = ID;
        this.fName = fName;
        this.lName = lName;
        this.nickName = nickName;
        this.phone = phone;
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

    public String getnickName() {
        return this.nickName;
    }

    public String getPhone() {
        return this.phone;
    }

    public String toString() {
        String goon = "";
        goon += getFName().toUpperCase() + " \"" + getnickName().toUpperCase() + "\" " + getLName().toUpperCase() + "\n";
        goon += getPhone();
        return goon;
    }

    // ------------------------------
    //  METHODS - Setters
    // ------------------------------

    public void setFName(String fName) {
        this.fName = fName;
    }

    public void setLName(String lName) {
        this.lName = lName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
