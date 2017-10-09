package py.com.snowtech.demo;

import java.math.BigInteger;

public enum FooEnum {
    FIRST, SECOND;

    int getValue() {
        return Math.max(FIRST.ordinal(), SECOND.ordinal());
    }

    String valueStr() {
        return FooEnum.class.getName();
    }

    BigInteger valueBig() {
        return BigInteger.TEN;
    }

    int valued() {
        return 8;
    }

    static int valued2() {
        return 34;
    }
}
