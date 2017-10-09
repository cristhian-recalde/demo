package py.com.snowtech.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FooEnumTest {

    private FooEnum fooEnum;

    @Before
    public void setUp() throws Exception {
        fooEnum = FooEnum.FIRST;
    }

    @Test
    public void test_getValue_GivenLiteralInGet_ExpectsReturnConstant() {
        assertEquals(1, fooEnum.getValue());
    }

    @Test
    public void test_getValue2_GivenLiteralInGet_ExpectsReturnConstant() {
        assertEquals(34, FooEnum.valued2());
    }
}