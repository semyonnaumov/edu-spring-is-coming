package com.naumov.alishev;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    private void doInit() {
        System.out.println(this + " initialization");
    }

    private void doDestroy() {
        System.out.println(this + " destruction");
    }
}