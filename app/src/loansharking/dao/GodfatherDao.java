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

    // C
    void createGodfather(Godfather godfather);

    // R
    Godfather readGodfatherById(int ID);
    List<Godfather> readAllGodfathers();

    // U
    void updateGodFather(Godfather godfather);

    //D
    void deleteGodfather(Godfather godfather);
}
