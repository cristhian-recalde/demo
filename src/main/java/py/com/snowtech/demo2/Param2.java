package py.com.snowtech.demo2;

public enum Param2 {

    FIRST("Zero", 0), SECOND("Minus", -1);

    Param2(String name, int value) {
        this.name = name;
        this.value = value;
    }

    private String name;
    private int value;

    public String getNameFirst() {
        return FIRST.name;
    }

    public int getValueSecond() {
        return SECOND.value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
