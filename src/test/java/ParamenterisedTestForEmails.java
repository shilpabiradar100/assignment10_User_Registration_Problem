import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import utility.UtilRegex;
import utility.UtilValidation;

@RunWith(Parameterized.class)
public class ParamenterisedTestForEmails {

    private boolean expectedResult;
    private String argument;

    public ParameterisedTestForEmails(boolean expectedResult, String argument) {
        this.expectedResult = expectedResult;
        this.argument = argument;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {
                { true , "abc@yahoo.com"},
                { false , "abc-100@yahoo.com"},
                { true , "abc.100@yahoo.com"},
                { true , "abc111@abc.com"},
                { false , "abc-100@abc.net"},
                { true , "abc.100@abc.com.au"},
                { true , "abc@1.com"},
                { true , "abc@gmail.com.com"},
                { false , "abc+100@gmail.com"},
                { false , "abc"},
                { true , "abc@.com.my"},
                { false , "abc123@gmail.a"},
                { false , "abc123@.com"},
                { true , "abc123@.com.com"},
                { true , ".abc@abc.com"},
                { false , "abc()*@gmail.com"},
                { false , "abc@%*.com"},
                { true , "abc..2002@gmail.com"},
                { true , "abc.@gmail.com"},
                { false , "abc@abc@gmail.com"},
                { false , "abc@gmail.com.1a"},
                { true , "abc@gmail.com.aa.au"}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testEmail() {
        Boolean result = UtilValidation.checkRegex(this.argument, UtilRegex.email);
        assertEquals(this.expectedResult, result);
    }
}
