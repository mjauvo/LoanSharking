package loansharking.dao;

import java.util.*;
import loansharking.model.*;

/**
 * An interface class for database operations.
 * <p>
 * @author Markus J. Auvo 2019
 */
public interface GoonDao
{
    // ------------------------------
    //  METHODS - C R U D
    // ------------------------------

    void createGoon(Goon goon);      // C
    Goon readGoonById(int ID);       // R
    List<Goon> readAllGoons();       // R
    void deleteGoon(Goon goon);      // D
}
