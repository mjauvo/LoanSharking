package loansharking.dao;

import java.util.*;
import loansharking.model.*;

/**
 *
 * @author mjauv
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
