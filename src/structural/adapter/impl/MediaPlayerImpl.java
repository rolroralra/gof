package structural.adapter.impl;

import structural.adapter.MediaPlayer;
import structural.adapter.MediaPlayerAdapter;

public class MediaPlayerImpl implements MediaPlayer {
    /* Use Adapter Pattern
     * Interconnect two incompatible interfaces. (AdvancedMediaPlayer & MediaPlayer)
     * */
    private MediaPlayer mediaPlayerAdapter = null;

    @Override
    public void play(String fileName, String fileType) {
        /* Implementation by Adapter */
        for (MediaPlayerAdapter.AdvancedMediaType type : MediaPlayerAdapter.AdvancedMediaType.values()) {
            if (type.name().equalsIgnoreCase(fileType)) {
                if (mediaPlayerAdapter == null) {
                    mediaPlayerAdapter = new MediaPlayerAdapter();
                    System.out.println(mediaPlayerAdapter.getClass().getSimpleName() + " instanced!");
                }

                mediaPlayerAdapter.play(fileName, fileType);
                return;
            }
        }

        /* Implementation by self */
        if (fileType.equalsIgnoreCase("MP3")) {
            System.out.println(this.getClass().getSimpleName() + "::play(" + fileName + ", " + fileType + ") called!");
        }
        else if (fileType.equalsIgnoreCase("AVI")) {
            System.out.println(this.getClass().getSimpleName() + "::play(" + fileName + ", " + fileType + ") called!");
        }
        else {
            System.out.print("Failed to play!! ");
            System.out.println(this.getClass().getSimpleName() + " cannot play " + fileName + "." + fileType);
        }
    }
}
