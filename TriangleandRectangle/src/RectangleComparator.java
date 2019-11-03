import java.util.Comparator;

public class RectangleComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle o1, Rectangle o2) {
        if (o1.getHeight() > o2.getHeight()) {
            return 1;
        } else if ( o1.getHeight() < o2.getHeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}