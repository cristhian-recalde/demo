package com.aurea;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.junit.After;
import org.junit.Before;

public class LoggerUsingTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private static final Charset CHARSET = StandardCharsets.UTF_8;

    @Before
    public void setUpStreams() throws UnsupportedEncodingException {
        System.setOut(new PrintStream(outContent, false, CHARSET.name()));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    protected String getLogs() throws UnsupportedEncodingException {
        return outContent.toString(CHARSET.name());
    }

    protected void clearConsole() {
        outContent.reset();
    }
}
