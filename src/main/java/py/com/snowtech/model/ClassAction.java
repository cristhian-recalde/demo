package py.com.snowtech.model;

import py.com.snowtech.model.interfaces.VMConstants;


public class ClassAction implements VMConstants {

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
