package com.aurea;

public class Particle {
    private static Particle instance = null;

    private Particle() {
    }

    public static Particle getInstance() {
        if (instance == null) {
            synchronized (instance) {
                instance = new Particle();
            }
        }
        return instance;
    }
    
}
