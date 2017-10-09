package guava;

public class SingletonFile {

    private static SingletonFile ourInstance = new SingletonFile();

    public static SingletonFile getInstance() {
        return ourInstance;
    }

    private SingletonFile() {
    }
}
