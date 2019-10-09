package structual.adapter.impl;

import structual.adapter.MediaPlayer;
import structual.adapter.MediaPlayerAdapter;

public class MediaPlayerImpl implements MediaPlayer {
    private MediaPlayer mediaPlayAdapter = null;

    @Override
    public void play(String fileName, String fileType) {
        /* Implementation by Adapter */
        for (MediaPlayerAdapter.AdvancedMediaType type : MediaPlayerAdapter.AdvancedMediaType.values()) {
            if (type.name().equalsIgnoreCase(fileType)) {
                if (mediaPlayAdapter == null) {
                    mediaPlayAdapter = new MediaPlayerAdapter();
                }

                mediaPlayAdapter.play(fileName, fileType);
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
