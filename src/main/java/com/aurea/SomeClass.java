package com.aurea;

public class SomeClass {
    private int value;
    private int tag;
    
    private SomeClass() {
        
    }
    
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public int getTag() {
        return tag;
    }
    public void setTag(int tag) {
        this.tag = tag;
    }
    
    private class TestPrivate {
        public int getAnotherData() {
            return 10;
        }
    }
}

