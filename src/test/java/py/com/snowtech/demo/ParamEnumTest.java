package py.com.snowtech.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParamEnumTest {

    private ParamEnum paramEnum;

    @Before
    public void setUp() throws Exception {
        paramEnum = ParamEnum.FIRST;
    }

    @Test
    public void test_getName_GivenValueSet_ExpectsValueInGet() {
        paramEnum.setName("string");

        assertEquals("string", paramEnum.getName());
    }

    @Test
    public void test_getValue_GivenValueSet_ExpectsValueInGet() {
        paramEnum.setValue(0);

        assertEquals(0, paramEnum.getValue());
    }
}