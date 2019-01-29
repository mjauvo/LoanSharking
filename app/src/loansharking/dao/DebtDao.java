package loansharking.dao;

import java.util.*;
import loansharking.model.*;

/**
 * An interface class for database operations.
 * <p>
 * @author Markus J. Auvo 2019
 */
public interface DebtDao
{
    // ------------------------------
    //  METHODS - C R U D
    // ------------------------------

    void createDebt(Debt debt);     // C
    Debt readDebtById(int ID);      // R
    List<Debt> readAllDebts();      // R
    void deleteDebt(Debt debt);     // D
}
