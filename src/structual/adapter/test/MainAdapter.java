package structual.adapter.test;

import structual.adapter.MediaPlayer;
import structual.adapter.impl.MediaPlayerImpl;

public class MainAdapter {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayerImpl();

        mediaPlayer.play("test01","avi");
        mediaPlayer.play("test02","mp4");
        mediaPlayer.play("test03","mp3");
        mediaPlayer.play("test04","mkv");
        mediaPlayer.play("test05","txt");
        mediaPlayer.play("test06","MP4");
        mediaPlayer.play("test07","mP3");
        mediaPlayer.play("test08","AVI");
        mediaPlayer.play("test09","MKv");
    }

}
