package py.com.snowtech.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.xml.namespace.QName;

import com.sun.xml.internal.bind.v2.schemagen.episode.Package;
import com.sun.xml.internal.txw2.Document;
import com.sun.xml.internal.txw2.TypedXmlWriter;


@SuppressWarnings("serial")
public class App implements Serializable, Cloneable, AutoCloseable {
  enum ET {
    NAM
  };

  volatile int manage;
  final String M = "none";
  private transient long per;

  public App() {

  }

  public App(String n) {
    super();
  }

  private static void prtest() {
    System.out.println("prTet");
  }

  public static native void longRu();

  public static void main(String[] args) {
    System.out.println("Hello World again!");
    // creating UUID
    UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");

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

  public synchronized void getMagicNumbers(double bol, int mag) throws Exception {

    ET eType;

    switch (mag) {
      case 0:
        throw new ArrayStoreException();
      case 1:
        throw new Exception();
      case 2:
        throw new IndexOutOfBoundsException();
      case 3:
        throw new OutOfMemoryError();
      case 4:
        throw new ArrayIndexOutOfBoundsException();
      case 5:
        throw new StackOverflowError();
      case 6:
        throw new StringIndexOutOfBoundsException();
      case 7:
        throw new RuntimeException();
      case 8:
        throw new AssertionError();
      case 9:
        throw new ClassCastException();
      case 10:
        throw new ClassCircularityError();
      case 11:
        throw new ClassFormatError();
      case 12:
        break;
      // throw new EnumConstantNotPresentException(eType, "MERGE");
      case 13:
        throw new Error();
      case 14:
        throw new ExceptionInInitializerError();
      case 15:
        throw new IllegalAccessError();
      case 16:
        throw new IllegalAccessException();
      case 17:
        throw new IllegalArgumentException();
      case 18:
        throw new IllegalMonitorStateException();
      case 19:
        throw new IllegalStateException();
      case 20:
        throw new IllegalThreadStateException();
      case 21:
        throw new IncompatibleClassChangeError();
      case 22:
        throw new InstantiationError();
      case 23:
        throw new InstantiationException();
      case 24:
        throw new ClassNotFoundException();
      case 25:
        throw new CloneNotSupportedException();
      case 26:
        throw new InternalError();
      case 27:
        throw new InterruptedException();
      case 28:
        throw new LinkageError();
      case 29:
        throw new NegativeArraySizeException();
      case 30:
        throw new NoClassDefFoundError();
      case 31:
        throw new NoSuchFieldError();
      case 32:
        throw new NoSuchFieldException();
      case 33:
        throw new NoSuchMethodError();
      case 34:
        throw new NoSuchMethodException();
      case 35:
        throw new NullPointerException();
      case 36:
        throw new TypeNotPresentException("a", new Throwable());
      case 37:
        throw new UnknownError();
      case 38:
        throw new UnsatisfiedLinkError();
      case 39:
        throw new UnsupportedClassVersionError();
      case 40:
        throw new UnsupportedOperationException();
      case 41:
        throw new VerifyError();
      case 42:
        throw new BootstrapMethodError();
      case 43:
        throw new SecurityException();
      case 44:
        throw new ReflectiveOperationException();
      default:
        break;
    }

    if (bol == 1.2) {
      System.out.println("1.2");
    } else {
      System.out.println("not 1.2");
    }

    try {
      Double a = Double.valueOf(3.4);
      Integer c = Integer.valueOf(Math.max(9, 3));
      ArrayList<Character> aChar = new ArrayList<>();
      Object p = new Object();
      Long lb = Long.valueOf(34);
      Float ff = Float.valueOf(2);
      Number nn;
      Byte by = Byte.MIN_VALUE;
      Short ss = Short.MIN_VALUE;
      StringBuffer sBuffer;
      StringBuilder sBuilder;
      Boolean b = Boolean.valueOf(true);
      CharSequence cs;

      assert (lb.equals(34));

      if (lb instanceof Number) {
        System.out.println("lb is a number");
      }

      if (aChar != null) {
        for (Character cc : aChar) {
          System.out.println("Item: " + cc);
        }
      }
      int i;

      for (i = 0; i < 3; i++);
      i = 0;

      while (i++ < 4);

      i = 0;
      do {
        ++i;
      } while (i < 5);

    } catch (RuntimeException e) {
      System.err.println("err runtime");
    } catch (VirtualMachineError ex) {
      System.out.println("got vm error");
    } finally {
      System.out.println("quiting");
    }

    Appendable iap;
    ClassLoader classLoader = new ClassLoader() {};
    com.sun.org.apache.xpath.internal.compiler.Compiler comp =
        new com.sun.org.apache.xpath.internal.compiler.Compiler();
    Package pa = new Package() {

      @Override
      public Document getDocument() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void commit(boolean arg0) {
        // TODO Auto-generated method stub

      }

      @Override
      public void commit() {
        // TODO Auto-generated method stub

      }

      @Override
      public void block() {
        // TODO Auto-generated method stub

      }

      @Override
      public void _pcdata(Object arg0) {
        // TODO Auto-generated method stub

      }

      @Override
      public void _namespace(String arg0, boolean arg1) {
        // TODO Auto-generated method stub

      }

      @Override
      public void _namespace(String arg0, String arg1) {
        // TODO Auto-generated method stub

      }

      @Override
      public void _namespace(String arg0) {
        // TODO Auto-generated method stub

      }

      @Override
      public <T extends TypedXmlWriter> T _element(String arg0, String arg1, Class<T> arg2) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public <T extends TypedXmlWriter> T _element(QName arg0, Class<T> arg1) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public <T extends TypedXmlWriter> T _element(String arg0, Class<T> arg1) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public <T extends TypedXmlWriter> T _element(Class<T> arg0) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void _comment(Object arg0) throws UnsupportedOperationException {
        // TODO Auto-generated method stub

      }

      @Override
      public void _cdata(Object arg0) {
        // TODO Auto-generated method stub

      }

      @Override
      public <T extends TypedXmlWriter> T _cast(Class<T> arg0) {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public void _attribute(String arg0, String arg1, Object arg2) {
        // TODO Auto-generated method stub

      }

      @Override
      public void _attribute(QName arg0, Object arg1) {
        // TODO Auto-generated method stub

      }

      @Override
      public void _attribute(String arg0, Object arg1) {
        // TODO Auto-generated method stub

      }

      @Override
      public void name(String arg0) {
        // TODO Auto-generated method stub

      }
    };
    Process ps = new Process() {

      @Override
      public int waitFor() throws InterruptedException {
        // TODO Auto-generated method stub
        return 0;
      }

      @Override
      public OutputStream getOutputStream() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public InputStream getInputStream() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public InputStream getErrorStream() {
        // TODO Auto-generated method stub
        return null;
      }

      @Override
      public int exitValue() {
        // TODO Auto-generated method stub
        return 0;
      }

      @Override
      public void destroy() {
        // TODO Auto-generated method stub

      }
    };
    ProcessBuilder pBuilder = new ProcessBuilder("cmd ~");
    Readable read = new Readable() {

      @Override
      public int read(CharBuffer cb) throws IOException {

        return 0;
      }
    };
    // "Character.UnicodeScriptProcessBuilder.Redirec",
    RuntimePermission r = new RuntimePermission("test");
    SafeVarargs svarg = new SafeVarargs() {

      @Override
      public Class<? extends Annotation> annotationType() {
        // TODO Auto-generated method stub
        return null;
      }
    };

    SecurityManager smana = new SecurityManager();
    StackTraceElement ste = new StackTraceElement("App.java", "methdName", "uno", 2);
    StrictMath smath;
    ThreadDeath tet = new ThreadDeath();
    ThreadGroup tGrut = new ThreadGroup("oe");
    System system;
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
