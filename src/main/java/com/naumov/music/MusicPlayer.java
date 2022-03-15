package com.naumov.music;

import java.util.List;

public class MusicPlayer {
    private List<Music> availableMusic;
    private Music playingMusic;
    private String name;
    private int volume;
    private String color;
    private int speakers;

    public MusicPlayer(Music playingMusic) {
        this.playingMusic = playingMusic;
    }

    public MusicPlayer() {
    }

    public void playMusic() {
        System.out.println("[" + name + ", " + volume + ", " + color + ", " + speakers + "] " + playingMusic.getSong());
    }

    public void showAvailable() {
        System.out.println(availableMusic);
    }

    public void setPlayingMusic(Music playingMusic) {
        this.playingMusic = playingMusic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeakers(int speakers) {
        this.speakers = speakers;
    }

    public void setAvailableMusic(List<Music> availableMusic) {
        this.availableMusic = availableMusic;
    }
}
