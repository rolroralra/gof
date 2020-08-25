package structural.adapter.impl;

import structural.adapter.AdvancedMediaPlayer;

public class MkvPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.print("Failed to play!! ");
        System.out.println(this.getClass().getSimpleName() + " cannot play " + fileName + ".mp4");
    }

    @Override
    public void playMkv(String fileName) {
        System.out.println(this.getClass().getSimpleName() + "::playMkv(" + fileName + ") called!");
    }
}
