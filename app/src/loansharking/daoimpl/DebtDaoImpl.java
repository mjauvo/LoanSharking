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
public class DebtDaoImpl implements DebtDao
{
    // ------------------------------
    //  VARIABLES
    // ------------------------------

    // A list representing a database
    private List<Debt> debts;

    // ------------------------------
    //  CONSTRUCTOR(S)
    // ------------------------------

    public DebtDaoImpl() {
        this.debts = new ArrayList<>();
    }


    // ------------------------------
    //  METHODS - [C] R U D
    // ------------------------------

    @Override
    public void createDebt(Debt debt) {
        // Replace the list operation with a real database operation
        this.debts.add(debt);
    }

    // ------------------------------
    //  METHODS - C [R] U D
    // ------------------------------

    @Override
    public Debt readDebtById(int ID) {
        // Replace the list operation with a real database operation
        return this.debts.get(ID);
    }

    @Override
    public List<Debt> readAllDebts() {
        // Replace the list operation with a real database operation
        return this.debts;
    }

    // ------------------------------
    //  METHODS - C R U [D]
    // ------------------------------

    @Override
    public void deleteDebt(Debt debt) {
        // Replace with a real database operation
        this.debts.remove(debt);
    }
}
