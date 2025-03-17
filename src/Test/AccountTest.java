package Test;

import Main.Account;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account account1;
    Account account2;
    Account account3;

    @BeforeEach // It's an initialization that runs before the test
    void setUp() {
        account1 = new Account();
        account2 = new Account();
        account3 = account2;
    }
    @Test
    public void testEquality() {// u need the import assertion and test
        assertEquals(account3,account2);// assertEquals methods returns true if the two things are equal
    }

    @Test
    public void testWithDrawLimit() {
        account1.setBalance(200.0);
        account1.withdraw(100.0);
        assertEquals(true, account1.getBalance() >= 0);
    }
}
