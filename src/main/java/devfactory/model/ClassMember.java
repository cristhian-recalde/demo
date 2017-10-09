package devfactory.model;

public class ClassMember extends Member {

    public ClassMember(String name, int id) {
        super(name, id, new CodeProperties("http://localhost", 9090));
    }

    public ClassMember(String name) {
        super(name, 0, new CodeProperties("http://someserver", 4040));
    }
}
