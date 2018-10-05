package py.com.snowtech.demo2;

import java.util.List;
import java.util.UUID;

public class Printer2 implements AutoCloseable {

    public static void main(String[] args) {
        System.out.println("Hello World again!");
        // creating UUID
        UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d").randomUUID();

        // checking the value of random UUID
        System.out.println("Random UUID value: " + uid.randomUUID());

        List<String> leter = null;

        leter.forEach(t -> System.out.println(t));

        char b = '1';
        int a = 0;
        long c = 1;

        double d = 1.2;
        float ff = 2.3f;
        short ss = 1;
        byte bb = 125;
        boolean bo = false;

        System.out.println(b);

        Runtime ru;
        Runnable rr = new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
    }

    interface nameInterfaceTest {

    }

    abstract class AbsClassTest {

    }

    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub

    }

    @Deprecated
    public void getTitle() {
        Void v;

        System.out.println("not to be used anymore");
    }
}
