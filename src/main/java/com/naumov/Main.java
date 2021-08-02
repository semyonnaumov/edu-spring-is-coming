package com.naumov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer player0 = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer player1 = context.getBean("musicPlayer", MusicPlayer.class);

        System.out.println(player0 == player1); // false since prototype

        Music classicalMusic0 = context.getBean("classicalMusic", Music.class);
        Music classicalMusic1 = context.getBean("classicalMusic", Music.class);

        System.out.println(classicalMusic0 == classicalMusic1); // true since singleton

        context.close();
    }
}
