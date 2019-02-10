package loansharking.util;

import java.sql.*;

/**
 * A class being charge of the database connection.
 * <p>
 * @author Markus J. Auvo 2019
 */
public class Database
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    private final String URL = "jdbc:mysql://localhost/loanshark";
    private final String USER = "root";
    private final String PASS = "vertrigo";
    
    private Connection DBconn = null;
    
    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public Database() {}

    // ------------------------------
    //  METHODS
    // ------------------------------

    /**
     * Returns a new database connection.
     *
     * @pre Database connection is null or not open
     * @post Database connection is open.
     * @throws java.sql.SQLException
     * @return Connection
     */
    public Connection openConnection() throws SQLException {
        if (DBconn == null || DBconn.isClosed()) {
            try {
                System.out.print("Opening database connection...");
                DBconn = DriverManager.getConnection(URL, USER, PASS);
                System.out.println("OPEN");
            }
            catch (Exception e) {
                System.out.println("FAILED");
                System.out.println("Reason: " + e.getMessage());
                System.exit(0);
            }
        }
        return DBconn;
    }

    /**
     * Closes a database connection.
     *
     * @pre  Database connection is open.
     * @post Database connection is closed and null.
     * @throws java.sql.SQLException
     */
    public void closeConnection() throws SQLException {
        if(DBconn != null || !DBconn.isClosed()) {
            try {
                System.out.print("Closing database connection...");
                DBconn.close();
                DBconn = null;
                System.out.println("CLOSED");
            }
            catch (Exception e) {
                System.out.println("FAILED");
                System.out.println("Reason: " + e.getMessage());
                System.exit(0);
            }
        }
    }
}