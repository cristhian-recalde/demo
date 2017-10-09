package py.com.snowtech.demo;

import static org.testng.Assert.assertEquals;

import java.math.BigDecimal;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FunctionTestWithNG {

    @BeforeClass
    public void setUp() {
      // code that will be invoked when this test is instantiated
    }
    
    @org.testng.annotations.Test(groups = { "fast" })
    public void test_getMagicNumbers_expectsFalse() {
      System.out.println("Fast test");
    }
    
    @org.testng.annotations.Test(groups = { "slow" })
    public void test_getMagicNumbers_expectsTrue() {
       System.out.println("Slow test");
    }

    @Test
    public void test_getToken_expectsNotNull() {
        assert true;
    }
    
    @org.junit.Test
    public void test_getToken_expectsNotNullJunit() {
        assert true;
    }
    
    @Test // (enabled   =      false)
    public void test_getToken_expectsFalseNotNull() {
        FunctionParser fp = new FunctionParser();
        assertEquals(true, fp.isFunction("public void test_get("));
    }

    /*
    @Test
    public void checkBigDecimals() {
        BigDecimal one = new BigDecimal(1000);
        BigDecimal two = new BigDecimal(1000);

        assertEquals(one, two);
    }

    @Test
    public void checkBigDecimals2() {
        BigDecimal one = new BigDecimal(1000);
        BigDecimal two = new BigDecimal(1000.00);

        assertEquals(one, two);
    } */
}
