package com.mironova.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        Music music = context.getBean("rockMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        Music music1 = context.getBean("classicalMusic", Music.class);

        MusicPlayer classicalMusicPlayer = new MusicPlayer(music1);

        classicalMusicPlayer.playMusic();

        Music music2 = context.getBean("popMusic", Music.class);

        MusicPlayer popMusicPlayer = new MusicPlayer(music2);

        popMusicPlayer.playMusic();

        context.close();
    }
}
