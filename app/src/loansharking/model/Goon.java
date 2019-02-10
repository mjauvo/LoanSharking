package loansharking.model;

/**
 * A class representing a goon, i.e.
 * a person who ensures that the debt is paid....
 * <p>
 * @author Markus J. Auvo 2019
 */
public class Goon
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    private int ID;
    private String firstName;
    private String lastName;
    private String nickName;
    private String phone;
    private Godfather boss;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public Goon(int ID, String firstName, String lastName, String nickName, String phone, Godfather boss) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.phone = phone;
        this.boss = boss;
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

    public String getNickName() {
        return this.nickName;
    }

    public String getPhone() {
        return this.phone;
    }

    public Godfather getBoss() {
        return this.boss;
    }

    @Override
    public String toString() {
        String goon = "";
        goon += getFirstName().toUpperCase() + " \"" + getNickName().toUpperCase() + "\" " + getLastName().toUpperCase() + "\n";
        goon += getPhone();
        goon += getBoss().getFirstName() + "\"" + getBoss().getNickName() + "\"" + getBoss().getLastName() + "\n";
        return goon;
    }

    // ------------------------------
    //  METHODS - Setters
    // ------------------------------

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBoss(Godfather boss) {
        this.boss = boss;
    }
}
