package guava;

public class Foo {
    private final static int privateFinalStaticInt;
    final int defaultFinalInt;
    protected int memberValue;

    static {
        privateFinalStaticInt = 2;
    }

    {
        defaultFinalInt = 4;
        memberValue = 3;
    }

    Foo(int bar) {
        this.memberValue = bar;
    }

    public static int getPrivateFinalStaticInt() {
        return privateFinalStaticInt;
    }

    public int getDefaultFinalInt() {
        return defaultFinalInt;
    }

    public int getMemberValue() {
        return memberValue;
    }
}
