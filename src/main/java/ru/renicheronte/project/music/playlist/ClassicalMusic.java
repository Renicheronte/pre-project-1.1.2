package ru.renicheronte.project.music.playlist;

import ru.renicheronte.project.music.Music;

public class ClassicalMusic implements Music {

    public void initMethod() {
        System.out.println(ClassicalMusic.class + " Initialization");
    }

    public void destroyMethod() {
        System.out.println(ClassicalMusic.class + " Destruction");
    }
    @Override
    public String getSong() {
        return "Classical music";
    }
}
