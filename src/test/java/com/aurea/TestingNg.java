package com.aurea;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public abstract class TestingNg {

    @Test
    public void testValue() {
        assertEquals(true, getTesting());
    }
    
    protected abstract boolean getTesting();
}
