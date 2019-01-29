package loansharking.model;

/**
 * A class representing a debt.
 */
public class Debt
{
	// ------------------------------
	//  VARIABLES
	// ------------------------------

	private int ID;
	private int amount;
	private double interest;
	private String borrowedDate;
	private String dueDate;
	private String paidDate;

	// ------------------------------
	//  CONSTRUCTOR(S)
	// ------------------------------

	/**
	 * Luo uuden lainan
	 */
	public Debt(int ID, int amount, double interest, String borrowedDate, String dueDate) {
		this.ID = ID;
		this.amount = amount;
		this.interest = interest;
		this.borrowedDate = borrowedDate;
		this.dueDate = dueDate;
		this.paidDate = null;
	}

    // ------------------------------
	//  METHODS - Getters
	// ------------------------------

    public int getID() {
		return this.ID;
	}

    public int getAmount() {
		return this.amount;
	}

    public double getInterest() {
		return this.interest;
	}

    public String getBorrowedDate() {
        return this.borrowedDate;
	}

    public String getDueDate() {
		return this.dueDate;
    }

    public String getPaidDate() {
        return this.paidDate;
    }

    public String toString() {
        String loan = "";
        loan += "$" + getAmount() + " (" + getInterest() + "%)\n";
        loan += "Borrowed: " + getBorrowedDate() + "\n";
        loan += "Due: " + getDueDate() + "\n";
        loan += "Paid: ";
        if (paidDate != null) {
            loan += getPaidDate();
        }
        return loan;
    }

	// ------------------------------
	//  METHODS - Setters
	// ------------------------------

    public void setAmount (int amount) {
        this.amount = amount;
    }

    public void setInterest (double interest) {
        this.interest = interest;
    }

    public void setDueDate (String dueDate) {
        this.dueDate = dueDate;
    }

    public void setPaidDate (String paidDate) {
        this.paidDate = paidDate;
    }
}
