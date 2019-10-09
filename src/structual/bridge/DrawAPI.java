package structual.bridge;

public interface DrawAPI {
    void drawCircle(int x, int y, int radius);
    void drawRectangle(int width, int height);
    default void drawSquare(int length) {
        this.drawRectangle(length, length);
    }
}
