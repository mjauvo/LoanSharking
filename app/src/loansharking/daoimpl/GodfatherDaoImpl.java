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
public class GodfatherDaoImpl implements GodfatherDao
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    // A list representing a database
    private List<Godfather> godfathers;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public GodfatherDaoImpl() {
        this.godfathers = new ArrayList<>();
    }


    // ------------------------------
    //  METHODS - [C] R U D
    // ------------------------------

    @Override
    public void createGodfather(Godfather godfather) {
        // Replace the list operation with a real database operation
        this.godfathers.add(godfather);
    }

    // ------------------------------
    //  METHODS - C [R] U D
    // ------------------------------

    @Override
    public Godfather readGodfatherById(int ID) {
        // Replace the list operation with a real database operation
        return this.godfathers.get(ID);
    }

    @Override
    public List<Godfather> readAllGodfathers() {
        // Replace the list operation with a real database operation
        return this.godfathers;
    }

    // ------------------------------
    //  METHODS - C R [U] D
    // ------------------------------

    @Override
    public void updateGodFather(Godfather godfather) {
        // Replace the list operation with a real database operation
        this.godfathers.add(godfather);
    }

    // ------------------------------
    //  METHODS - C R U [D]
    // ------------------------------

    @Override
    public void deleteGodfather(Godfather godfather) {
        // Replace with a real database operation
        this.godfathers.remove(godfather);
    }
}
