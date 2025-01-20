package coord2.domain;

import coord2.exception.IllegalPointException;

import java.util.Objects;

import static coord2.constant.CoordConstant.MAX;
import static coord2.constant.CoordConstant.MIN;


public class Point {

    private final int x;
    private final int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point at(int x, int y){
        validate(x, y);
        return new Point(x, y);
    }

    private static void validate(int x, int y) {
        if(x < MIN || x > MAX || y < MIN || y > MAX){
            throw new IllegalPointException();
        }
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Point point = (Point) object;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
