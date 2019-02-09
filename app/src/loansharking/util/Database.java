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
        //System.out.println("\nDatabase connection: " + DBconn);
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
	 */
	public void closeConnection() throws SQLException {
        //System.out.println("Database connection: " + conn);
        if(DBconn != null || !DBconn.isClosed()) {
    		try {
                System.out.print("Closing database connection...");
                DBconn.close();
                //System.out.println("Database connection: " + conn + "\n");
                DBconn = null;
                System.out.println("CLOSED");
                //System.out.println("Database connection: " + conn + "\n");
            }
            catch (Exception e) {
                System.out.println("FAILED");
                System.out.println("Reason: " + e.getMessage());
                System.exit(0);
            }
        }
	}

 	/**********************************************
	 * TIETOKANTA; HAKUOPERAATIOT
	 **********************************************/

	/**
	 * Hakee asiakkaan nimen perusteella
	 * AE: nimi != null  
	*/
	public void haeAsiakas(String nimi)
	{
	}

	/**
	 * Hakee lainan id:n perusteella
	 * AE: id > 0
	*/
	public void haeLaina(int id)
	{
	}

	/**
	 * Hakee lainan summan perusteella
	 * AE: summa > 0
	*/
	public void haeLaina(double summa)
	{
	}

	/**
	 * Hakee kummised�n
	 *
	 * AE: nimi != null
	 */
	public void haeKummiseta(String nimi)
	{
	}

	/**
	 * Hakee lainan perintaa hoitavan gorillan lainan id:n perusteella
	 * AE: lainaId > 0
	 */
	public void haeLainanGorilla(int lainaId)
	{
	}

	/**
	 * Hakee lainan perintaa hoitavan gorillan lainan summan perusteella
	 * AE: lainaSumma > 0
	 */
	public void haeLainanGorilla(double lainaSumma)
	{
	}

	/**
	 * Hakee kummisedan vastuulla olevat lainat kummised�n id:n perusteella
	 * AE: kummisetaId > 0
	 */
	public void haeKummisedanLainat(int kummisetaId)
	{
	}

	/**
	 * Hakee kummisedan vastuulla olevat lainat kummised�n nimen perusteella
	 * AE: nimi != null
	 */
	public void haeKummisedanLainat(String nimi)
	{
	}

 	/**********************************************
	 * TIETOKANTA; TULOSTUSOPERAATIOT
	 **********************************************/

	/**
	 * Tulostaa kokonaisen taulun
	 * AE: taulu != null
	*/
	public void tulostaTaulu(String taulu)
	{
	}
	
	/**
	 * Tulostaa hakutulokset
	 * AE: true
	 */
	public void ulostaTulos(ResultSet tulos, ResultSetMetaData meta) throws SQLException
	{
		try {
			for(int i = 0; i < meta.getColumnCount(); i++) {
				System.out.print(meta.getColumnName(i + 1));

				if(i != meta.getColumnCount() - 1)
					System.out.print(", ");
			}
			System.out.println();
			tulos.beforeFirst();
			while(tulos.next())
			{
				for(int i = 0; i < meta.getColumnCount(); i++) {
					System.out.println(tulos.getString(i + 1));
				}
				System.out.println();
			}
		}
		catch (Exception e) {
			System.out.println("Kantatonttu on vihainen: " + e);
		}
	}


 	/**********************************************
	 * TIETOKANTA; LIS�YSOPERAATIOT
	 **********************************************/

	/**
	 * Lis�� tietokantaan uuden asiakkaan, attribuutit parameterina
	 *
	 * AE: etuNimi != null && sukuNimi != null &&
	 *     osoite != null && puhelin != null
	 */
	public void lisaaAsiakas(String etuNimi, String sukuNimi, 
							 String osoite, String puhelin) {
	}

	/**
	 * Lis�� tietokantaan uuden lainan, attribuutit parametreina.
	 * Palauttaa uuden lainan id:n.
	 *
	 * AE: lainaSumma >= 0 && korko >= 0 &&
	 *     ottoPvm != null && eraPvm != null
	 */
	public int lisaaLaina(double lainaSumma, double korko, String ottoPvm, String eraPvm, int asiakasId, int kummisetaId) {
        return 0;
	}
	
	/**
	 * Lis�� lainalle gorillan
	 * AE: lainaID > 0 && gorillaID > 0
	 */
	public void lisaaGorillaVastuu(int lainaID, int gorillaID) {
	}
}