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

    // C
    void createDebt(Debt debt);

    // R
    Debt readDebtById(int ID);
    List<Debt> readAllDebts();

    // U
    void updateDebt(Debt debt);

    // D
    void deleteDebt(Debt debt);
}