package com.aurea;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public abstract class TestingUnit {
    
    @Test
    public void testValue() {
        assertEquals(true, getTesting());
    }
    
    protected abstract boolean getTesting();
}
