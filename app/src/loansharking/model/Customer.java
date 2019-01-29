package loansharking.model;

/**
 * A class representing a customer, i.e.
 * the debt payer, the unfortunate individual.
 */
public class Customer
{
	// ------------------------------
	//  VARIABLES
	// ------------------------------

	private int ID;
	private String fName;
	private String lName;
	private String address;
	private String phone;
    private String email;

	// ------------------------------
	//  CONSTRUCTOR(S)
	// ------------------------------

    public Customer() {
    }

    public Customer(int ID, String fName, String lName, String address, String phone, String email) {
		this.ID = ID;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
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

	public String getAddress() {
		return this.address;
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
		customer += getFName().toUpperCase() + " " + getLName().toUpperCase() + " ";
		customer += "(" + getID() + ")\n";
		customer += getAddress() + "\n";
		customer += getPhone() + "\n";
		customer += getEmail() + "\n";
		return customer;
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
