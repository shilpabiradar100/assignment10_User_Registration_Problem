
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import utility.UtilRegex;
public class LastNameTest {

    @Test
    public void testFirstLetterCapital() {
        assertTrue("Biradar".matches(UtilRegex.name));
    }

    @Test
    public void testFirstTwoLetterCapital() {
        assertFalse("BIradar".matches(UtilRegex.name));
    }

    @Test
    public void testCapitalLetterPositionWrong() {
        assertFalse("biradAR".matches(UtilRegex.name));
    }

    @Test
    public void testFirstLetterSmall() {
        assertFalse("biradar".matches(UtilRegex.name));
    }

    @Test
    public void testFirstNameWithNumer() {
        assertFalse("biradar123".matches(UtilRegex.name));
    }

    @Test
    public void testFirstNameWithSpecialCharacter() {
        assertFalse("Bir@!d@r".matches(UtilRegex.name));
    }

    @Test
    public void testFirstNameMinLengthIs3() {
        assertFalse("Bi".matches(UtilRegex.name));
    }

    @Test
    public void testFirstNameMinLength() {
        assertTrue("Bir".matches(UtilRegex.name));
    }
}
