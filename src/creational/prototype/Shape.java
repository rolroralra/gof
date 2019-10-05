package creational.prototype;

import lombok.Getter;
import lombok.Setter;

public abstract class Shape implements Cloneable {
    @Getter
    @Setter
    private int id;

    @Getter
    private String type;

    protected Shape() {
        this.type = this.getClass().getSimpleName();
    }

    abstract public void draw();

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Shape : ").append(this.getType()).toString();
    }
}
