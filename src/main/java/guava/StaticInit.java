package guava;

public class StaticInit {
    private static int other;

    public static void main(String[] args) {
        System.out.println(StaticInit.getStaticOther());
        StaticInit app = new StaticInit();
        System.out.println(app.getOther());
        System.out.println(StaticInit.getStaticOther());
        System.out.println(Math.PI);
    }

    {
        other = 4;
    }

    StaticInit() {
        other = 1;
    }

    public int getOther() {
        return other;
    }

    public static int getStaticOther() {
        return other;
    }

    static {
        other = 2;
    }

    public String getValue() {
        return (123 + 456)*15 + "ABC";
    }

    public float getFloat() {
        return 123/456.0f;
    }

    public float getInvalid() {
        return 123/0;
    }

    public long getValueMax() {
        return Math.max(123, 456);
    }
}
