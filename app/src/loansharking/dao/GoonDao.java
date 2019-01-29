package loansharking.dao;

import java.util.*;
import loansharking.model.*;

/**
 *
 * @author mjauv
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
