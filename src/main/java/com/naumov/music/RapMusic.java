package com.naumov.music;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap God";
    }

    private RapMusic() {
    }

    public static RapMusic init() {
        return new RapMusic();
    }

    private void doInit() {
        System.out.println(this + " initialization");
    }

    private void doDestroy() {
        System.out.println(this + " destruction");
    }
}
