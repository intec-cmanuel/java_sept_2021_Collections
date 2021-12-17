package be.intecbrussel;

import java.util.Comparator;

public class HeightBoxComparator implements Comparator<Box> {

    @Override
    public int compare(Box o1, Box o2) {
        return o1.getHeight() - o2.getHeight();
    }
}
