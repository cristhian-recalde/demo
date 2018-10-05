package py.com.snowtech.demo2;

public class ClassAction2 {

    int ACCPublic = 1;
    int ACCPrivate = -1;

    private String line;
    private int setting;

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    void checkStatus() {
        System.out.println(ACCPublic);
    }

    void initVar() {
        this.setting = ACCPrivate;
    }

}
