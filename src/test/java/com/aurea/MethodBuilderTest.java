package com.aurea;

import static org.junit.Assert.assertEquals;

import org.testng.Assert;
import java.util.Vector;

import org.junit.*;

import com.aurea.model.ClassAction;
import com.aurea.model.EntityAction;
import com.aurea.model.InterfaceAction;
import com.aurea.model.VMConstants;

public class MethodBuilderTest {

    private MethodBuilder fp;
    
    @Before
    public void setup() {
        fp = new MethodBuilder();
    }
    
    @Test
    public void testIsAEntityAction() {
        MethodBuilder fp2 = new MethodBuilder();
        EntityAction ac = new EntityAction();
        ac.setLine("public void test_get() {");

        assertEquals(true, fp2.makeAction(ac));
    }

    @Test
    public void testIsAClassAction() {
        ClassAction ac = new EntityAction();
        ac.setLine("public void test_get() {");

        assertEquals(true, fp.makeAction(ac));
    }

    @Test
    public void testIsInterfaceAction() {
        InterfaceAction ac = new InterfaceAction();

        assertEquals(true, fp.makeAction(ac));
    }
    
    @Test
    public void testIsAVMConstantsInterfaceAction() {
        VMConstants ac = new InterfaceAction();

        assertEquals(true, fp.makeAction(ac));
    }

    @Test
    public void testUsingVector() {
        Vector<String> at = new Vector<>();
        at.add("someFunct");

        assertEquals(true, fp.makeAction(at));
    }
    
    @org.testng.annotations.Test
    public void testUsingVectorReference() {
        Vector<String> at = new Vector<>();
        at.add("someFunct");

        Assert.assertEquals(true, fp.makeAction(at));
    }
    
    private int someOtherFunction() {
        return 1;
    }
    
    @After
    public void clean() {
        fp = null;
    }
    
}
