
import java.util.*;

/**
 *
 * @author tohir
 */
public final class Point {

    private final int x, y;

    public Point(int x0, int y0) {
        x = x0;
        y = y0;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public boolean equals(Object ob) {
        if (!(ob instanceof Point)) {
            return false;
        }
        Point p = (Point) ob;
        return x == p.x && y == p.y;
    }
}

class CollectionPoint {

    List<Point> list = new ArrayList<>();

    /**
     * Add element to arrayList
     *
     * @param p
     */
    public void add(Point p) {
        list.add(p);
    }

    /**
     * Search the array list
     *
     * @param p
     * @return boolean
     */
    public boolean search(Point p) {
        Boolean isFound = false;
        for (Point ab : list) {
            if (ab.equals(p)) {
                isFound = true;
                break;
            }
        }

        return isFound;
    }

    /**
     * return a list containing all values of x
     *
     * @param x
     * @return
     */
    public List<Point> getAllX(int x) {
        // declare an arrayList to store all x points
        List<Point> listx = new ArrayList<>();

        for (Point ab : list) {
            if (ab.x() == x) {
                listx.add(ab);
            }
        }

        return listx;
    }

    /**
     * This method will replace the p1 with p2 in the list
     *
     * @param p1
     * @param p2
     */
    public void replace(Point p1, Point p2) {
        list.set(list.indexOf(p1), p2);
    }

    /**
     * ToString implementation
     *
     * @return
     */
    public String toString() {
        String result = "";
        for (Point ab : list) {
            result += ab.toString();
        }
        return result;
    }
}
