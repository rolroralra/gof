package structual.adapter;

import lombok.Getter;
import structual.adapter.impl.MkvPlayer;
import structual.adapter.impl.Mp4Player;

public class MediaPlayerAdapter implements MediaPlayer {
    AdvancedMediaPlayer adapter;

    public enum AdvancedMediaType {
        MKV(MkvPlayer.class, null),
        MP4(Mp4Player.class, null);

        @Getter
        private Class<?> advancedMediaPlayerClazz;

        private AdvancedMediaPlayer advancedMediaPlayer;

        private AdvancedMediaType(Class<?> advancedMediaPlayerClazz, AdvancedMediaPlayer advancedMediaPlayer) {
            this.advancedMediaPlayerClazz = advancedMediaPlayerClazz;
            this.advancedMediaPlayer = advancedMediaPlayer;
        }

        public AdvancedMediaPlayer getAdvancedMediaPlayer() throws IllegalAccessException, InstantiationException {
            if (this.advancedMediaPlayer == null) {
                this.advancedMediaPlayer = (AdvancedMediaPlayer) this.advancedMediaPlayerClazz.newInstance();
                System.out.println(this.advancedMediaPlayer.getClass().getSimpleName() + " instanced!");
            }

            return this.advancedMediaPlayer;
        }

        public void play(String fileName) throws InstantiationException, IllegalAccessException {
            if (this.name().equals(MKV.name())) {
                this.getAdvancedMediaPlayer().playMkv(fileName);
            }
            else if (this.name().equals(MP4.name())) {
                this.getAdvancedMediaPlayer().playMp4(fileName);
            }
        }
    }
    @Override
    public void play(String fileName, String fileType) {
        for (AdvancedMediaType mediaType: AdvancedMediaType.values()) {
            if (mediaType.name().equalsIgnoreCase(fileType)) {
                try {
                    mediaType.play(fileName);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
