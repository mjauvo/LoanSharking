package loansharking.daoimpl;

import java.util.*;
import loansharking.dao.*;
import loansharking.model.*;

/**
 * A class implementing an interface
 * for database operations.
 * <p>
 * @author Markus J. Auvo 2019
 */
public class GoonDaoImpl implements GoonDao
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    // A list representing a database
    private List<Goon> goons;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public GoonDaoImpl() {
        this.goons = new ArrayList<>();
    }


    // ------------------------------
    //  METHODS - [C] R U D
    // ------------------------------

    @Override
    public void createGoon(Goon goon) {
        // Replace the list operation with a real database operation
        this.goons.add(goon);
    }

    // ------------------------------
    //  METHODS - C [R] U D
    // ------------------------------

    @Override
    public Goon readGoonById(int ID) {
        // Replace the list operation with a real database operation
        return this.goons.get(ID);
    }

    @Override
    public List<Goon> readAllGoons() {
        // Replace the list operation with a real database operation
        return this.goons;
    }

    // ------------------------------
    //  METHODS - C R U [D]
    // ------------------------------

    @Override
    public void deleteGoon(Goon goon) {
        // Replace with a real database operation
        this.goons.remove(goon);
    }
}
