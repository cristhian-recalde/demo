package com.aurea;

import java.time.Duration;
import java.time.Instant;

// @Slf4j
public class IterationLogger {

    private static final Duration MAX_INTERVAL_BETWEEN_LOGS = Duration.ofSeconds(30);

    private long stepsPassed;
    private long stepsTowardsNextLog;
    private long stepsTotal;
    private String message;
    private Instant lastLogInstant;
    private final Instant firstLogInstant;

    public IterationLogger(long stepsTotal, String message) {
        System.out.println("Steps total received " + stepsTotal + "\n");
        this.stepsTotal = stepsTotal;
        this.message = message;
        firstLogInstant = lastLogInstant = Instant.now();
    }

    public void iterate() {
        iterate(1);
    }

    public void iterate(long steps) {
        stepsPassed += steps;
        stepsTowardsNextLog += steps;
        // System.out.println("stepsPassed = [" + stepsPassed + "], stepsTowardsNextLog = [" + stepsTowardsNextLog + "], stepsTotal = [" + stepsTotal + "]");
        if (stepsTowardsNextLog >= getLogSizeIteration() || stepsPassed >= stepsTotal
                || Duration.between(lastLogInstant, Instant.now()).compareTo(MAX_INTERVAL_BETWEEN_LOGS) > 0) {
            reportCurrentState();
            stepsTowardsNextLog %= getLogSizeIteration();
            lastLogInstant = Instant.now();
        }
    }

    void reportCurrentState() {
        String timeLeft = "";
        if (stepsPassed > 0L) {
            timeLeft = Duration.ofSeconds(Duration.between(firstLogInstant, Instant.now()).getSeconds()
                    * (stepsTotal - stepsPassed) / stepsPassed).toString();
        }
        System.out.printf("%s%% Done. [%s] of [%s] %s. Time left: %s\n",
        // log.info("{}% Done. [{}] of [{}] {}. Time left: {}",
                String.format("%.2f", ((double) stepsPassed / stepsTotal) * 100),
                stepsPassed, stepsTotal, message, timeLeft);
    }

    long getLogSizeIteration() {
        return stepsTotal / 20 + 1;
    }
}
