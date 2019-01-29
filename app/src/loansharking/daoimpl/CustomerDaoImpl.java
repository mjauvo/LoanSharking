package loansharking.daoimpl;

import java.util.*;
import loansharking.dao.*;
import loansharking.model.*;

/**
 * A class implementing an interface
 * for database operations.
 * <p>
 * @author Markus J. Auvo 2019
 */
public class CustomerDaoImpl implements CustomerDao
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    // A list representing a database
    private List<Customer> customers;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public CustomerDaoImpl() {
        this.customers = new ArrayList<>();
    }


    // ------------------------------
    //  METHODS - [C] R U D
    // ------------------------------

    @Override
    public void createCustomer(Customer customer) {
        // Replace the list operation with a real database operation
        this.customers.add(customer);
    }

    // ------------------------------
    //  METHODS - C [R] U D
    // ------------------------------

    @Override
    public Customer readCustomerById(int ID) {
        // Replace the list operation with a real database operation
        return this.customers.get(ID);
    }

    @Override
    public List<Customer> readAllCustomers() {
        // Replace the list operation with a real database operation
        return this.customers;
    }

    // ------------------------------
    //  METHODS - C R U [D]
    // ------------------------------

    @Override
    public void deleteCustomer(Customer customer) {
        // Replace with a real database operation
        this.customers.remove(customer);
    }
}
