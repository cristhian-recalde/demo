package py.com.snowtech.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class TestTwo {
  // temporary utility
  /*public static final List<Token> LANGUAGE_KEYWORDS = Arrays.asList(
      new Token("AbstractMethodError"), new Token("Appendable"),
      new Token("ArrayIndexOutOfBoundsException"), new Token("ArrayStoreException"),
      new Token("AssertionError"), new Token("AutoCloseable"), new Token("Boolean"),
      new Token("BootstrapMethodError"), new Token("BreakStatement"), new Token("Byte"),
      new Token("CharSequence"), new Token("Character"),
      new Token("Character.UnicodeScriptProcessBuilder.Redirec"), new Token("ClassCastException"),
      new Token("ClassCircularityError"), new Token("ClassFormatError"), new Token("ClassLoader"),
      new Token("ClassNotFoundException"), new Token("CloneNotSupportedException"),
      new Token("Cloneable"), new Token("Compiler"), new Token("Deprecated"),
      new Token("DoWhileStatement"), new Token("Double"),
      new Token("EnumConstantNotPresentException"), new Token("Error"), new Token("Exception"),
      new Token("ExceptionInInitializerError"), new Token("ForStatement"),
      new Token("ForeachStatement"), new Token("Float"), new Token("IfStatement"),
      new Token("IllegalAccessError"), new Token("IllegalAccessException"),
      new Token("IllegalArgumentException"), new Token("IllegalMonitorStateException"),
      new Token("IllegalStateException"), new Token("IllegalThreadStateException"),
      new Token("IncompatibleClassChangeError"), new Token("IndexOutOfBoundsException"),
      new Token("InstantiationError"), new Token("InstantiationException"), new Token("Integer"),
      new Token("InternalError"), new Token("InterruptedException"), new Token("LinkageError"),
      new Token("Long"), new Token("Math"), new Token("NegativeArraySizeException"),
      new Token("NoClassDefFoundError"), new Token("NoSuchFieldError"),
      new Token("NoSuchFieldException"), new Token("NoSuchMethodError"),
      new Token("NoSuchMethodException"), new Token("NullPointerException"), new Token("Number"),
      new Token("NumberFormatException"), new Token("Object"), new Token("OutOfMemoryError"),
      new Token("Override"), new Token("Process"), new Token("ProcessBuilder"),
      new Token("Readable"), new Token("ReflectiveOperationException"), new Token("Runnable"),
      new Token("Runtime"), new Token("RuntimeException"), new Token("RuntimePermission"),
      new Token("SafeVarargs"), new Token("SecurityException"), new Token("SecurityManager"),
      new Token("Short"), new Token("StackOverflowError"), new Token("StackTraceElement"),
      new Token("StrictMath"), new Token("String"), new Token("StringBuffer"),
      new Token("StringBuilder"), new Token("StringIndexOutOfBoundsException"),
      new Token("SuppressWarnings"), new Token("System"), new Token("Thread"),
      new Token("ThreadDeath"), new Token("ThreadGroup"), new Token("Throwable"),
      new Token("TypeNotPresentException"), new Token("UnknownError"),
      new Token("UnsatisfiedLinkError"), new Token("UnsupportedClassVersionError"),
      new Token("UnsupportedOperationException"), new Token("VerifyError"), new Token("Void"),
      new Token("assert"), new Token("boolean"), new Token("byte"), new Token("char"),
      new Token("const"), new Token("double"), new Token("IfStatement"), new Token("float"),
      new Token("goto"), new Token("int"), new Token("long"), new Token("short"),
      new Token("SwitchSection"), new Token("ThrowStatement"), new Token("TryStatement"),
      new Token("WhileStatement"), new Token("ContinueStatement"));*/
  
  
//temporary utility
 public static final List<String> LANGUAGE_KEYWORDS = Arrays.asList("AbstractMethodError",
     "Appendable", "ArrayIndexOutOfBoundsException", "ArrayStoreException", "AssertionError",
     "AutoCloseable", "Boolean", "BootstrapMethodError", "BreakStatement", "Byte", "CharSequence",
     "Character", "Character.UnicodeScriptProcessBuilder.Redirec", "ClassCastException",
     "ClassCircularityError", "ClassFormatError", "ClassLoader", "ClassNotFoundException",
     "CloneNotSupportedException", "Cloneable", "Compiler", "Deprecated", "DoWhileStatement",
     "Double", "EnumConstantNotPresentException", "Error", "Exception",
     "ExceptionInInitializerError", "ForStatement", "ForeachStatement", "Float", "IfStatement",
     "IllegalAccessError", "IllegalAccessException", "IllegalArgumentException",
     "IllegalMonitorStateException", "IllegalStateException", "IllegalThreadStateException",
     "IncompatibleClassChangeError", "IndexOutOfBoundsException", "InstantiationError",
     "InstantiationException", "Integer", "InternalError", "InterruptedException", "LinkageError",
     "Long", "Math", "NegativeArraySizeException", "NoClassDefFoundError", "NoSuchFieldError",
     "NoSuchFieldException", "NoSuchMethodError", "NoSuchMethodException", "NullPointerException",
     "Number", "NumberFormatException", "Object", "OutOfMemoryError", "Override", "Process",
     "ProcessBuilder", "Readable", "ReflectiveOperationException", "Runnable", "Runtime",
     "RuntimeException", "RuntimePermission", "SafeVarargs", "SecurityException",
     "SecurityManager", "Short", "StackOverflowError", "StackTraceElement", "StrictMath", "String",
     "StringBuffer", "StringBuilder", "StringIndexOutOfBoundsException", "SuppressWarnings",
     "System", "Thread", "ThreadDeath", "ThreadGroup", "Throwable", "TypeNotPresentException",
     "UnknownError", "UnsatisfiedLinkError", "UnsupportedClassVersionError",
     "UnsupportedOperationException", "VerifyError", "Void", "assert", "boolean", "byte", "char",
     "const", "double", "IfStatement", "float", "goto", "int", "long", "short", "SwitchSection",
     "ThrowStatement", "TryStatement", "WhileStatement", "ContinueStatement");

  public static void main(String[] args) {
    List<Token> lexems = new ArrayList<>();

    lexems.add(new Token("Long"));
    lexems.add(new Token("long"));
    lexems.add(new Token("double"));
    lexems.add(new Token("Double"));
    lexems.add(new Token("short"));
    lexems.add(new Token("Short"));

    // long vocabularyScore =
    System.out.println(lexems.size());
    Stream<Token> s1 = lexems.stream().filter(p -> LANGUAGE_KEYWORDS.contains(p));
    
    s1.distinct().count();
    
    String value = "http://github.com/xthian82/project.git";
    
    String [] letters = value.split(","); 
    
  }
  
  public void testDoWhile() throws Exception {
      Integer i=0;
      do {
          try {
            BufferedReader br = new BufferedReader(new FileReader(new File("aFile.txt")));
            
            synchronized (i) {
                br.readLine();
                br.close();
            }
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("can't read file");
        } catch (IOException e) {
            e.printStackTrace();
        }
          
      } while (i++ < 6);
  }


}


class Token {
  private String token;

  public Token(String token) {
    super();
    this.token = token;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((token == null) ? 0 : token.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    System.out.println(obj + " -" + this);
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Token other = (Token) obj;
    if (token == null) {
      if (other.token != null)
        return false;
    } else if (token.equalsIgnoreCase(other.token)) {
      System.out.println(" ** ");
      return true;
    }
    return false;
  }

  public String getToken() {
    return token;
  }

  @Override
  public String toString() {
    return "Token [token=" + token + "]";
  }

}

