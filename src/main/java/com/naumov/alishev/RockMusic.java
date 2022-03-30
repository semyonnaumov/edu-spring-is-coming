package com.naumov.alishev;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Bohemian Rhapsody";
    }

    private void doInit() {
        System.out.println(this + " initialization");
    }

    private void doDestroy() {
        System.out.println(this + " destruction");
    }
}
