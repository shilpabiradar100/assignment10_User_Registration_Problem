

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import utility.UtilRegex;


public class EmailTest {
    @Test
    public void testValidEmail() {
        assertTrue("gaikwadm853@gmail.com".matches(UtilRegex.email));
    }

    @Test
    public void emailWithOnlyWords() {
        assertTrue("gaikwadmanoj@gmail.com".matches(UtilRegex.email));
    }

    @Test
    public void testEmailWithMultiPart() {
        assertTrue("gaikwad12.manoj12@gmail.co.bl.in".matches(UtilRegex.email));
    }

    @Test
    public void testEmailWithoutAtTheRate() {
        assertFalse("gaikwadm853gmail.com".matches(UtilRegex.email));
    }

    @Test
    public void testEmailWithoutCom() {
        assertFalse("gaikwadm853@gmail".matches(UtilRegex.email));
    }

    @Test
    public void testEmailWithCapitalWord() {
        assertFalse("gaikwadMANOJ853@gmail.com".matches(UtilRegex.email));
    }
}
