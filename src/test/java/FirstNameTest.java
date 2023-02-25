
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.example.UtilRegex;
import org.junit.Test;

public class FirstNameTest {
    @Test
    public void testFirstLetterCapital() {
        assertTrue("shilpa".matches(UtilRegex.name));
    }

    @Test
    public void testFirstTwoLetterCapital() {
        assertFalse("SHilpa".matches(UtilRegex.name));
    }

    @Test
    public void testCapitalLetterPositionWrong() {
        assertFalse("Shilpa".matches(UtilRegex.name));
    }

    @Test
    public void testFirstLetterSmall() {
        assertFalse("shilpa".matches(UtilRegex.name));
    }

    @Test
    public void testFirstNameWithNumer() {
        assertFalse("shilpa123".matches(UtilRegex.name));
    }

    @Test
    public void testFirstNameWithSpecialCharacter() {
        assertFalse("Shilp@!".matches(UtilRegex.name));
    }

    @Test
    public void testFirstNameMinLengthIs3() {
        assertFalse("Arjun".matches(UtilRegex.name));
    }

    @Test
    public void testFirstNameMinLength() {
        assertTrue("Sai".matches(UtilRegex.name));
    }


}
