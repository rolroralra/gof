package test.shape.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import test.shape.AbstractShape;

@EqualsAndHashCode(callSuper = true)
@Data
public class Ellipse<T> extends AbstractShape {
    private T width;
    private T height;

    public Ellipse(T width, T height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(Object... args) {
        super.resize(args);

        try {
            appendWidth((T) args[0]);
            appendHeight((T) args[1]);
        } catch (ArrayIndexOutOfBoundsException ignored) {

        }
    }

    private void appendWidth(T arg) {
        if (arg instanceof Integer) {
            this.width = (T) Integer.valueOf(Integer.sum((Integer) this.width, (Integer) arg));
        }
    }

    private void appendHeight(T arg) {
        if (arg instanceof Integer) {
            this.height = (T) Integer.valueOf(Integer.sum((Integer) this.height, (Integer) arg));
        }
    }


}
