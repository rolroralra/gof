package test.shape;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Point<T> {
    private T x;
    private T y;

    public static <T> Point<T> newPoint(T x, T y) {
        return new Point<>(x, y);
    }

}
