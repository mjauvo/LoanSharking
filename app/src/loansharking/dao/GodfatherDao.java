package loansharking.dao;

import java.util.*;
import loansharking.model.*;

/**
 * An interface class for database operations.
 * <p>
 * @author Markus J. Auvo 2019
 */
public interface GodfatherDao
{
    // ------------------------------
    //  METHODS - C R U D
    // ------------------------------

    void createGodfather(Godfather godfather);      // C
    Godfather readGodfatherById(int ID);            // R
    List<Godfather> readAllGodfathers();            // R
    void deleteGodfather(Godfather godfather);      // D
}
