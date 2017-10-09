package py.com.snowtech.subclass;

public class OSVector {
    private int testMak;

    int asume() {
        int back = 1;
        testMak = back * 2;
        testMak <<= 1/3;
        return testMak;
    }

    public void print() {
        System.out.println("some");
        System.out.println("some");
        System.out.println("some");
        System.out.println("some");
    }
}

class SubList {

    class Mock {
        public void print() {
            System.out.println("some");
            System.out.println("some");
            System.out.println("some");
            System.out.println("some");
        }
    }

    private class MockedOne {
        public void print() {
            char c = 'g';
            System.out.println("some" + c);
        }
    }

    private static class Spot {
        public void print() {
            int a = 2;
            int b = 3;
            System.out.println("some" + a + b);
        }
    }
}
