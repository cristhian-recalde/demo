package py.com.snowtech.demo;

import com.aurea.model.ClassAction;
import java.math.BigDecimal;
import java.util.regex.Pattern;
import py.com.snowtech.model.interfaces.VMConstants;

public class FunctionParser2 {

    private static Pattern function = Pattern.compile("\\w[A-Za-z0-9_]+\\([\\s*\\w*][,\\s*\\w\\s*]*\\)\\s*");

    public boolean isFunction(String line) {
        int i = 0;
        return function.matcher(line).find();
    }


    public boolean isFunction(String line, int amount) {
        int i = amount;
        return function.matcher(line).find();
    }

    public boolean isFunction(String line, short amount) {
        return function.matcher(line).find();
    }

    public boolean isFunction(String line, int amount, boolean far) {
        int i = amount;
        return function.matcher(line).find() || far;
    }

    public boolean isFunction(String line, Integer amount, boolean far) {
        int i = amount;
        return function.matcher(line).find() || far;
    }

    public boolean isFunction(String line, Job amount, boolean far) {
        Job i = amount;
        return function.matcher(line).find() || far;
    }

    public boolean isFunction(ClassAction action) {
        return function.matcher(action.getLine()).find();
    }

    public boolean isFunction(VMConstants action) {
        return action.ACCPublic == 1;
    }

    public BigDecimal getBigDecimal() {
        return BigDecimal.TEN;
    }

    public BigDecimal getOneString() {
        return new BigDecimal("1.00");
    }

    public Integer getValueInt() {
        return new Integer("10");
    }

    public double getRange() {
        int var = 0;
        return 123.0f / var;
    }

    public class Bar {

        private Bar() {

        }

        public int getCase25() {
            return 25;
        }

        public class Inner {

            public double getMoney() {
                return 3.4;
            }
        }
    }

    public class FirstInner {

        private final int foo = 54;

        public int getFoo() {
            return foo;
        }

        double getMaximun() {
            return Integer.MIN_VALUE;
        }
    }

    class SecondInner {

        private class InsideSecondPrivate {

            public int getInt() {
                return 8;
            }

            class OtherClass {

                private int methodOne() {
                    return 7;
                }
            }
        }

        class OtherInsideSecond {

            private OtherInsideSecond() {
            }

            int methodOne() {
                return 9;
            }
        }

        class WithNumberInsideSecond {

            int x;

            WithNumberInsideSecond(int n) {
                x = n;
            }

            int getX() {
                return x;
            }

            double getMax() {
                return Double.MAX_VALUE;
            }
        }
    }

    private class ThirdInner {

        class InsideThirdInner {

            double getDouble() {
                return 3.4;
            }
        }
    }

    class FourthInner {

        private int x;

        FourthInner(int x) {
            this.x = x;
        }

        class InnerInner {

            public int getX() {
                return x;
            }
        }
    }
}
