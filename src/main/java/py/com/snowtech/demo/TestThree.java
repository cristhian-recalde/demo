package py.com.snowtech.demo;
class TestThree {

    enum MyValue {
        FIRST, SECOND;

        static int max() {
            return Math.max(FIRST.ordinal(), SECOND.ordinal());
        }
    }

    public static void main(String[] args) {
        System.out.println(getValueNode("~~"));
        System.out.println(getValueNode("``"));
        System.out.println(MyValue.FIRST.ordinal());
        System.out.println(MyValue.SECOND.ordinal());
        MyValue myValue = MyValue.valueOf("FIRST");
        System.out.println("=================");
        System.out.println(myValue.ordinal());
        System.out.println(myValue.name());
        // System.out.println(MyValue.valueOf("FIRSTs"));
        System.out.println(MyValue.valueOf(""));
    }

    static double getValueNode(String str) {
        double sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Math.pow(127, i) * (int) (str.charAt(i));
        }

        return sum;
    }
}
