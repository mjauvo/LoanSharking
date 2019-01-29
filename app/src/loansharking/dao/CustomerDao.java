package loansharking.dao;

import java.util.*;
import loansharking.model.*;

/**
 *
 * @author mjauv
 */
public interface CustomerDao
{
	// ------------------------------
	//  METHODS - C R U D
	// ------------------------------

    void createCustomer(Customer customer);     // C
    Customer readCustomerById(int ID);          // R
    List<Customer> readAllCustomers();          // R
    void deleteCustomer(Customer customer);     // D
}
