package structual.adapter.impl;

import structual.adapter.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println(this.getClass().getSimpleName() + "::playMp4(" + fileName + ") called!");
    }

    @Override
    public void playMkv(String fileName) {
        System.out.print("Failed to play!! ");
        System.out.println(this.getClass().getSimpleName() + " cannot play " + fileName + ".mkv");
    }
}
