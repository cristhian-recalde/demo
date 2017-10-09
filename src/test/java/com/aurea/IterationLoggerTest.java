package com.aurea;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.UnsupportedEncodingException;
import org.junit.Test;

public class IterationLoggerTest extends LoggerUsingTest {

    private static final String TEST_MESSAGE = "TEST MESSAGE";

    @Test
    public void testIterationLogger() throws UnsupportedEncodingException {
        IterationLogger iterationLogger = new IterationLogger(37, TEST_MESSAGE);

        assertThat(getLogs()).doesNotContain(TEST_MESSAGE);

        iterationLogger.reportCurrentState();

        assertThat(getLogs()).contains("[0] of [37] " + TEST_MESSAGE);

        iterationLogger.iterate();
        iterationLogger.iterate(1);

        assertThat(getLogs()).doesNotContain("[1] of [37] " + TEST_MESSAGE);
        assertThat(getLogs()).contains("[2] of [37] " + TEST_MESSAGE);

        iterationLogger.iterate(34);
        iterationLogger.iterate();
        iterationLogger.iterate();
        iterationLogger.iterate();

        assertThat(getLogs()).doesNotContain("[35] of [37] " + TEST_MESSAGE);
        assertThat(getLogs()).contains("[36] of [37] " + TEST_MESSAGE);
        assertThat(getLogs()).contains("[37] of [37] " + TEST_MESSAGE);
    }

    @Test
    public void testMaxPrint() {
        assertThat(new IterationLogger(6, TEST_MESSAGE).getLogSizeIteration()).isEqualTo(1);
        assertThat(new IterationLogger(19, TEST_MESSAGE).getLogSizeIteration()).isEqualTo(1);
        assertThat(new IterationLogger(20, TEST_MESSAGE).getLogSizeIteration()).isEqualTo(2);
        assertThat(new IterationLogger(21, TEST_MESSAGE).getLogSizeIteration()).isEqualTo(2);
        assertThat(new IterationLogger(39, TEST_MESSAGE).getLogSizeIteration()).isEqualTo(2);
        assertThat(new IterationLogger(40, TEST_MESSAGE).getLogSizeIteration()).isEqualTo(3);
        assertThat(new IterationLogger(1756, TEST_MESSAGE).getLogSizeIteration()).isEqualTo(88);
    }
}
