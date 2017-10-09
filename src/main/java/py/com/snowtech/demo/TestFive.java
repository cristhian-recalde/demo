package py.com.snowtech.demo;

import java.util.Set;
import java.util.stream.Collectors;


public class TestFive {
/*
    public static final Set<String> LANGUAGE_KEYWORDS = ImmutableSet.of("AbstractMethodError", "Appendable",
            "ArrayIndexOutOfBoundsException", "ArrayStoreException", "AssertionError", "AssertStatement",
            "AutoCloseable", "Boolean", "BootstrapMethodError", "BreakStatement", "Byte", "CharSequence", "Character",
            "Character.UnicodeScript", "ProcessBuilder.Redirect", "ClassCastException", "ClassCircularityError",
            "ClassFormatError", "ClassLoader", "ClassNotFoundException", "CloneNotSupportedException", "Cloneable",
            "Compiler", "Deprecated", "DoWhileStatement", "Double", "EnumConstantNotPresentException", "Error",
            "Exception", "ExceptionInInitializerError", "ForStatement", "ForeachStatement", "Float", "IfStatement",
            "IllegalAccessError", "IllegalAccessException", "IllegalArgumentException", "IllegalMonitorStateException",
            "IllegalStateException", "IllegalThreadStateException", "IncompatibleClassChangeError",
            "IndexOutOfBoundsException", "InstantiationError", "LambdaExpression", "InstantiationException", "Integer",
            "InternalError", "InterruptedException", "LinkageError", "Long", "Math", "NegativeArraySizeException",
            "NoClassDefFoundError", "NoSuchFieldError", "NoSuchFieldException", "NoSuchMethodError",
            "NoSuchMethodException", "NullPointerException", "Number", "NumberFormatException", "Object",
            "OutOfMemoryError", "Override", "Process", "ProcessBuilder", "Readable", "ReflectiveOperationException",
            "Runnable", "Runtime", "RuntimeException", "RuntimePermission", "SafeVarargs", "SecurityException",
            "SecurityManager", "Short", "StackOverflowError", "StackTraceElement", "StrictMath", "String",
            "StringBuffer", "StringBuilder", "StringIndexOutOfBoundsException", "SuppressWarnings", "System", "Thread",
            "ThreadDeath", "ThreadGroup", "Throwable", "TypeNotPresentException", "UnknownError",
            "UnsatisfiedLinkError", "UnsupportedClassVersionError", "UnsupportedOperationException", "VerifyError",
            "Void", "char", "int", "SwitchCase", "ThrowStatement", "TryStatement", "WhileStatement",
            "ContinueStatement", "long", "short", "byte", "double", "boolean", "float", "void");*/
    
    public static void main(String[] args) {
        //System.out.println(LANGUAGE_KEYWORDS.stream().map(String::toLowerCase).collect(Collectors.toSet()).size());
        //System.out.println(LANGUAGE_KEYWORDS.stream().map(String::toLowerCase).collect(Collectors.counting()).intValue());  
        int size = 56514;
        int max = size / 2 * (size - 1);
        System.out.println(max);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.compare(5, 4));
        
       
    }

}
