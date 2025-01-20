package coord2.domain;

import coord2.exception.IllegalPointException;

import java.util.Objects;

import static coord2.constant.CoordConstant.MAX;
import static coord2.constant.CoordConstant.MIN;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        validate(x, y);
        this.x = x;
        this.y = y;
    }

    private void validate(int x, int y) {
        if (x < MIN || x > MAX || y < MIN || y > MAX) {
            throw new IllegalPointException();
        }
    }

    public double calcDistance(Point o) {
        // 제곱근((A.x - B.x)^제곱 + (A.y - B.y)^제곱)
        return sqrt(pow((x - o.x), 2) + pow((y - o.y), 2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
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
