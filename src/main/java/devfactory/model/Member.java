package devfactory.model;

public class Member {
    private String name;
    private int id;
    private CodeProperties codeProperties;

    public Member(String name, int id, CodeProperties codeProperties) {
        this.name = name;
        this.id = id;
        this.codeProperties = codeProperties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
