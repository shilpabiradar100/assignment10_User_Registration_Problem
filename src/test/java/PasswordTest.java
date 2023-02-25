
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.UtilRegex;

public class PasswordTest {
    @Test
    public void testValidPassword() {
        assertTrue("Shilpa#123".matches(UtilRegex.password));
    }

    @Test
    public void testPasswordWithoutCapitalWord() {
        assertFalse("shilpa#123".matches(UtilRegex.password));
    }

    @Test
    public void testPasswordWithoutSmallWord() {
        assertFalse("SHILPA#123".matches(UtilRegex.password));
    }

    @Test
    public void testPasswordWithoutNumbers() {
        assertFalse("Shilpa#biradar".matches(UtilRegex.password));
    }

    @Test
    public void testPasswordWithoutSpecialCharacter() {
        assertFalse("Shilpa123".matches(UtilRegex.password));
    }

}
