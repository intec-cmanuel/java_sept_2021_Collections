package be.intecbrussel;

import java.util.Objects;

public class Box implements Comparable<Box>{
    private int height;
    private int width;
    private int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return height == box.height && width == box.width && length == box.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width, length);
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", volume=" + height*width*length +
                '}';
    }

    @Override
    public int compareTo(Box o) {
        int volumeThisBox = length*width*height;
        int volumeOfBoxO = o.length*o.width*o.height;

        return volumeOfBoxO - volumeThisBox;
    }
}
