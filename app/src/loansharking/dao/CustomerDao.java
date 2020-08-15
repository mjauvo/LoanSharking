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

    // C
    void createCustomer(Customer customer);

    // R
    Customer readCustomerById(int ID);
    List<Customer> readAllCustomers();

    // U
    void updateCustomer(Customer customer);

    // D
    void deleteCustomer(Customer customer);
}
