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

    // C
    void createGoon(Goon goon);

    // R
    Goon readGoonById(int ID);
    List<Goon> readAllGoons();

    // U
    void updateGodFather(Goon goon);

    //D
    void deleteGoon(Goon goon);
}
