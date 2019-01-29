package loansharking.model;

/**
 * A class representing a mob godfather
 */
public class Godfather
{
	// ------------------------------
	//  VARIABLES
	// ------------------------------

	private int ID;
	private String fName;
	private String lName;
	private String phone;
	private String turf;

	// ------------------------------
	//  CONSTRUCTOR(S)
	// ------------------------------

	public Godfather(int ID, String fName, String lName, String phone, String turf) {
		this.ID = ID;
		this.fName = fName;
		this.lName = lName;
		this.phone = phone;
		this.turf = turf;
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

    public String getPhone() {
		return this.phone;
    }

    public String getTurf() {
        return this.turf;
    }

    public String toString() {
        String godfather = "";
		godfather += getFName().toUpperCase() + " \"" + getLName().toUpperCase() + "\n";
		godfather += getTurf();
		godfather += getPhone();
        return godfather;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setTurf(String turf) {
        this.turf = turf;
    }
}
