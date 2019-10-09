package structual.bridge;

/*
 * Adapter pattern makes things work after they are designed!
 * Bridge pattern makes them work before they are!
 * */
public interface DrawAPI {
    void drawCircle(int x, int y, int radius);
    void drawRectangle(int width, int height);
    default void drawSquare(int length) {
        this.drawRectangle(length, length);
    }
}
