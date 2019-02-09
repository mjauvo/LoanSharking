package loansharking.daoimpl;

import java.sql.*;
import java.util.*;
import loansharking.util.*;
import loansharking.dao.*;
import loansharking.model.*;

/**
 * A database layer class for Customer.
 * <p>
 * @author Markus J. Auvo 2019
 */
public class CustomerDaoImpl implements CustomerDao
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    private final Database DB;
    private Connection DBconn;
    private String sql;

    // Customer(s) retrieved from database
    private ArrayList<Customer> customers;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public CustomerDaoImpl() {
        this.DB  = new Database();
        this.customers = new ArrayList<Customer>();
    }


    // ------------------------------
    //  METHODS - [C] R U D
    // ------------------------------

    @Override
    public void createCustomer(Customer customer) {
        // Replace the list operation with a database operation
        this.customers.add(customer);
    }

    // ------------------------------
    //  METHODS - C [R] U D
    // ------------------------------

    /**
     * Fetches a customer from the database according to customer's database ID.
     *
     * @pre ID != null && ID > 
     * @post true
     * @param ID
     * @return ArrayList<Customer>
     */
    @Override
    public Customer readCustomerById(int ID) {
        System.out.print("Retrieving customer (" + ID + ")...");
        Customer cust = new Customer();

        try {
            DBconn = DB.openConnection();
			sql = "SELECT * FROM Asiakas WHERE Id=?";

            PreparedStatement pst = DBconn.prepareStatement(sql);
            pst.setInt(1, ID);

            ResultSet rst = pst.executeQuery(sql);
            System.out.println("DONE!");

            while(rst.next()) {
                cust.setID(rst.getInt("ID"));
                cust.setFName(rst.getString("FName"));
                cust.setLName(rst.getString("LName"));
                cust.setStreet(rst.getString("street"));
                cust.setZipCode(rst.getInt("zipcode"));
                cust.setCity(rst.getString("city"));
                cust.setPhone(rst.getString("phone"));
                cust.setEmail(rst.getString("email"));
            }

            pst.close();
            DBconn.close();
		}
		catch (SQLException e) {
            System.out.println("FAILED");
            System.out.println("Reason: " + e.getMessage());
		}

        return cust;
    }

    /**
     * Fetches all customers from the database.
     *
     * @pre true 
     * @post true
     * @return ArrayList<Customer>
     */
    @Override
    public List<Customer> readAllCustomers() {
        System.out.print("Retrieving all customers...");
        Customer cust;

        try {
            DBconn = DB.openConnection();
			sql = "SELECT * FROM Asiakas";

            PreparedStatement pst = DBconn.prepareStatement(sql);

            ResultSet rst = pst.executeQuery(sql);
            System.out.println("DONE!");

            while(rst.next()) {
                cust = new Customer();
                cust.setID(rst.getInt("ID"));
                cust.setFName(rst.getString("FName"));
                cust.setLName(rst.getString("LName"));
                cust.setStreet(rst.getString("street"));
                cust.setZipCode(rst.getInt("zipcode"));
                cust.setCity(rst.getString("city"));
                cust.setPhone(rst.getString("phone"));
                cust.setEmail(rst.getString("email"));
                this.customers.add(cust);
            }

            pst.close();
            DBconn.close();
		}
		catch (SQLException e) {
            System.out.println("FAILED");
            System.out.println("Reason: " + e.getMessage());
		}

        return customers;
    }

    // ------------------------------
    //  METHODS - C R U [D]
    // ------------------------------

    /**
     * Deletes a customer from the database.
     *
     * @pre true 
     * @post true
     * @param cust
     */
    @Override
    public void deleteCustomer(Customer cust) {
        System.out.print("Deleting customer (" + cust.getID() + ")...");

        try {
            DBconn = DB.openConnection();
            sql = "DELETE FROM Asiakas WHERE Id=?";

            PreparedStatement pst = DBconn.prepareStatement(sql);
            pst.setInt(1, cust.getID());

            ResultSet rst = pst.executeQuery(sql);
            System.out.println("DONE!");

            pst.close();
            DBconn.close();
        }
        catch (SQLException e) {
            System.out.println("FAILED");
            System.out.println("Reason: " + e.getMessage());
        }
    }
}
