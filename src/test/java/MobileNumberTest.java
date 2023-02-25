
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import utility.UtilRegex;


public class MobileNumberTest {

    @Test
    public void testValidMobileNumber() {
        assertTrue("91 8412824420".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void notNeededSpaceBetweenCountryCodeAndMobileNumber() {
        assertTrue("918412824420".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void useDashBetweenCountryCodeAndMobileNumber() {
        assertTrue("91-8412824420".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void testMobileNumberWithoutCountryCode() {
        assertFalse("8412822420".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void testMobileNumberMinLengthCountryCode1() {
        assertTrue("9 8412824420".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void testMobileNumberMaxLengthCountryCode3() {
        assertFalse("9123 8412824420".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void testMobileNumberFixedLength10() {
        assertTrue("91 8412824420".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void testIfMobileNumberLengthIsLessThen10() {
        assertFalse("91 841282442".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void testIfMobileNumberLengthIsGreaterThen10() {
        assertFalse("91 84128244200".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void testMobileNumberStartWith6789() {
        assertTrue("91 6412824420".matches(UtilRegex.mobileNumber));
        assertTrue("91 7412824420".matches(UtilRegex.mobileNumber));
        assertTrue("91 8412824420".matches(UtilRegex.mobileNumber));
        assertTrue("91 9412824420".matches(UtilRegex.mobileNumber));
    }

    @Test
    public void testMobileNumberCantStartWith012345() {
        assertFalse("91 0412824420".matches(UtilRegex.mobileNumber));
        assertFalse("91 1412824420".matches(UtilRegex.mobileNumber));
        assertFalse("91 2412824420".matches(UtilRegex.mobileNumber));
        assertFalse("91 3412824420".matches(UtilRegex.mobileNumber));
        assertFalse("91 4412824420".matches(UtilRegex.mobileNumber));
        assertFalse("91 5412824420".matches(UtilRegex.mobileNumber));
    }
}
