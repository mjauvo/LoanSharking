package loansharking.model;

import java.util.Date;

/**
 * A class representing a debt.
 * <p>
 * @author Markus J. Auvo 2019
 */
public class Debt
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    private int GodfatherID;
    private int CustomerID;
    private int amount;
    private int interestRate;
    private Date borrowedDate;
    private Date dueDate;
    private Date paidDate;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public Debt() {}

    public Debt(int GodfatherID, int CustomerID, int amount, int interestRate, Date borrowedDate, Date dueDate, Date paidDate) {
        this.GodfatherID = GodfatherID;
        this.CustomerID = CustomerID;
        this.amount = amount;
        this.interestRate = interestRate;
        this.borrowedDate = borrowedDate;
        this.dueDate = dueDate;
        this.paidDate = null;
    }

    // ------------------------------
    //  METHODS - Getters
    // ------------------------------

    public int getGodfatherID() {
        return this.GodfatherID;
    }

    public int getCustomerID() {
        return this.CustomerID;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getInterestRate() {
        return this.interestRate;
    }

    public Date getBorrowedDate() {
        return this.borrowedDate;
    }

    public Date getDueDate() {
        return this.dueDate;
    }

    public Date getPaidDate() {
        return this.paidDate;
    }

    @Override
    public String toString() {
        String loan = "";
        loan += "$" + getAmount() + " (" + getInterestRate() + "%)\n";
        loan += "Borrowed: " + getBorrowedDate().toString() + "\n";
        loan += "Due: " + getDueDate().toString() + "\n";
        loan += "Paid: ";
        if (paidDate != null) {
            loan += getPaidDate().toString();
        } else {
            loan += "<not yet>";
        }
        return loan;
    }

    // ------------------------------
    //  METHODS - Setters
    // ------------------------------

    public void setGodfatherID(int GodfatherID) {
        this.GodfatherID = GodfatherID;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setAmount (int amount) {
        this.amount = amount;
    }

    public void setInterestRate (int interestRate) {
        this.interestRate = interestRate;
    }

    public void setBorrowedDate (Date borrowedDate) {
        this.borrowedDate = borrowedDate;
    }

    public void setDueDate (Date dueDate) {
        this.dueDate = dueDate;
    }

    public void setPaidDate (Date paidDate) {
        this.paidDate = paidDate;
    }
}
