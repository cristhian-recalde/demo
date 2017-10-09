package com.aurea;

public class WorkerThreads {

    private final TestMet method = new TestMet() {
        @Override
        int getMethod() {
            return 0;
        }
    };

    public static void main(String[] args) {
        int MAX = 5;
        int size = 100;
        for (int i = 1; i <= size; i++) {
            System.out.println("Size: " + i + ", Div: " + (i / MAX) + ", Mod: " + i % MAX);
        }
        Particle p = Particle.getInstance();
    }

    abstract class SomeInnerClass {
        public String getString() {
            return "thisOne";
        }
    }

}
