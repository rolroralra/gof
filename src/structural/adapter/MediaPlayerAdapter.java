package structural.adapter;

import lombok.Getter;
import structural.adapter.impl.MkvPlayer;
import structural.adapter.impl.Mp4Player;

/*
* Adapter pattern makes things work after they are designed!
* Bridge pattern makes them work before they are!
* */
public class MediaPlayerAdapter implements MediaPlayer {
    /* Adapter Pattern
    * Interconnect two incompatible interfaces. (AdvancedMediaPlayer & MediaPlayer)
    * */
    AdvancedMediaPlayer adapter;

    public enum AdvancedMediaType {
        MKV(MkvPlayer.class, null),
        MP4(Mp4Player.class, null);

        @Getter
        private Class<?> advancedMediaPlayerClazz;

        private AdvancedMediaPlayer advancedMediaPlayer;

        AdvancedMediaType(Class<?> advancedMediaPlayerClazz, AdvancedMediaPlayer advancedMediaPlayer) {
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
            switch (this) {
                case MKV:
                    this.getAdvancedMediaPlayer().playMkv(fileName);
                    break;
                case MP4:
                    this.getAdvancedMediaPlayer().playMp4(fileName);
                    break;
            }
//            if (this.name().equals(MKV.name())) {
//                this.getAdvancedMediaPlayer().playMkv(fileName);
//            }
//            else if (this.name().equals(MP4.name())) {
//                this.getAdvancedMediaPlayer().playMp4(fileName);
//            }
        }
    }

    @Override
    public void play(String fileName, String fileType) {
        for (AdvancedMediaType mediaType: AdvancedMediaType.values()) {
            if (mediaType.name().equalsIgnoreCase(fileType)) {
                try {
                    mediaType.play(fileName);
                } catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
