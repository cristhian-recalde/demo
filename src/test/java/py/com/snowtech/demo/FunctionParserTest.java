package py.com.snowtech.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.math.BigDecimal;
import java.math.BigInteger;
import org.testng.*;
import org.junit.Ignore;
import org.junit.Test;

public class FunctionParserTest {

    private FunctionParser fp = new FunctionParser();
    
    @Test(expected = NullPointerException.class)
    public final void someName() throws Exception {
        assertEquals(false, fp.isFunction("public void test_get() "));
    }

    @Ignore
    @Test()
    public void someName2() throws Exception {
        String an = "some";
        FunctionParser fp2 = new FunctionParser();
        assertEquals(true, fp.isFunction("public void test_get() {"));
    }

    @Ignore("Fix the someName4")
    @Test
    public void someName4() throws Exception {
        assertEquals(1 + 3, 4);
    }

    @org.junit.Test
    public void someNameDotPrefix() throws Exception {
        assertEquals(1 + 3, 4);
    }

    @org.testng.annotations.Test
    public void someNameOther() throws Exception {
        assertEquals(true, fp.isFunction("public void test_get() {"));
    }

    @Test()
    @Ignore("Fix the someName5")
    public void someName5() throws Exception {
        assertEquals(1 - 3, -2);
    }

    @Test(timeout = 5000)
    @Ignore("Fix the someName6")
    public void someName6() throws Exception {
        assertEquals(1 - 3, -2);
    }

    /*
    @Test
    public void checkBigDecimals() {
        BigDecimal one = new BigDecimal(1000);
        BigDecimal two = new BigDecimal(1000);

        Assert.assertEquals(one, two);
    }

    @Test
    public void checkBigDecimals2() {
        BigDecimal one = new BigDecimal(1000);
        BigDecimal two = new BigDecimal(1000.00);

        assertEquals(one, two);
    }

    @Test
    public void checkBigDecimals3() {
        assertEquals(BigDecimal.TEN, fp.getBigDecimal());
    }

    @Test
    public void checkBigDecimals4() {
        BigDecimal one = new BigDecimal(10);

        assertEquals(one, BigDecimal.TEN);
    }

    @Test
    public void test_() throws Exception {
        BigDecimal one = BigDecimal.ONE;
        BigDecimal oneOne = new BigDecimal("1.00");

        assertEquals(one.intValue(), oneOne.intValue());
    } */

    @Test
    public void test_getOneString_GivenLiteralInGet_ExpectsReturnConstant() {
        assertEquals(new BigDecimal("1.00"), fp.getOneString());
    }

    @Test
    public void test_getRange() {
        assertTrue(Double.isInfinite(fp.getRange()));
    }

    public void test_getValueInt_GivenLiteralInGet_ExpectsReturnConstant() {
        assertEquals(new Integer("10").intValue(), fp.getValueInt().intValue());
    }
}
