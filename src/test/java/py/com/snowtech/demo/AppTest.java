package py.com.snowtech.demo;

import org.mockito.InjectMocks;

public class AppTest extends BTest {

    @InjectMocks
    private FunctionParser fp;

    int mock = 1;
    public AppTest(String testName) {
        super();
    }
    
    @Override
    public void setUp() {
        
    }
    
    @Override
    protected void tearDown() {
        
    }

    public void testFuctionString_int() {
        assertEquals(false, fp.isFunction("public void test_get() ", 1));
    }
    
    public void testFuctionString_intRef() {
        assertEquals(false, fp.isFunction("public void test_get() ", mock));
    }
    
    public void testFuctionString_intRefOther() {
        assertEquals(false, fp.isFunction("public void test_get() ", Static.num));
    }
    
    public void testFuctionString_Job_boolOther() {
        assertEquals(false, fp.isFunction("public void test_get() ", Static.job, false));
    }
    
    public void testFuctionString_intOp() {
        int intVar = 3;
        assertEquals(false, fp.isFunction("public void test_get() ", 1 + intVar - 30));
    }
    
    public void testFuctionString_intOpDiv() {
        int intVar = 3;
        int var2 = 1;
        assertEquals(false, fp.isFunction("public void test_get() ", intVar - var2 / 20));
    }
    
    public void testFuctionString_otherRef() {
        int intVar =3;
        boolean fp1 = fp.isFunction("public void test_get() ", (short)intVar);
        assertEquals(false, fp1);
    }
    
    public void testFuctionString_shortCast() {
        int intVar = 3;
        assertEquals(false, fp.isFunction("public void test_get() ", (short)intVar));
    }
    
    public void testFuctionString_intOpDivParh() {
        int intVar = 3;
        int var2 = 1;
        assertEquals(false, fp.isFunction("public void test_get() ", (intVar - var2) / 20));
    }
    
    public void testFuctionString_intinfix() {
        assertEquals(false, fp.isFunction("public void test_get() ", 1+2));
    }
    
    public void testFuctionString_max() {
        assertEquals(false, fp.isFunction("public void test_get() ", Math.max(1, 2)));
    }
    
    public void testFuctionString_int_bool() {
        assertEquals(false, fp.isFunction("public void test_get() ", 2, false));
    }
    
    public void testFuctionString_Job_bool() {
        Job i = new Job();
        assertEquals(false, fp.isFunction("public void test_get() ", i, false));
    }
    
    public void testFuctionString_Integer_bool() {
        Integer a = 2;
        assertEquals(false, fp.isFunction("public void test_get() ", a, true));
    }
    
    public void testJunit3Again2() {
        String name = "public void test_get() ";
        assertEquals(false, fp.isFunction(name));
    }
    
    @org.junit.Test
    public void testJunit() {
        assertTrue(true);
    }
    
    @org.testng.annotations.Test
    public void testNg() {
        assertTrue(true);
    }
    
}