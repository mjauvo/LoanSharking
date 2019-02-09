package loansharking.dao;

import java.util.*;
import loansharking.model.*;

/**
 * An interface class for database operations.
 * <p>
 * @author Markus J. Auvo 2019
 */
public interface CustomerDao
{
    // ------------------------------
    //  METHODS - C R U D
    // ------------------------------

    void createCustomer(Customer customer);        // C
    ArrayList<Customer> readCustomerById(int ID);  // R
    List<Customer> readAllCustomers();             // R
    void deleteCustomer(Customer customer);        // D
}
