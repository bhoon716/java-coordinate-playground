package coord2.domain;

import coord2.exception.IllegalTriangleException;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Triangle implements Shape {

    private final Point[] points;

    public Triangle(Point[] points) {
        validate(points);
        this.points = points;
    }

    private void validate(Point[] points) {
        if (points.length != 3) {
            throw new IllegalTriangleException();
        }
        if (points[0].equals(points[1]) || points[1].equals(points[2])
                || points[0].equals(points[2])) {
            throw new IllegalTriangleException();
        }
    }

    @Override
    public double size() {
        double a = points[0].calcDistance(points[1]);
        double b = points[1].calcDistance(points[2]);
        double c = points[2].calcDistance(points[0]);
        double aa = a * a;
        double bb = b * b;
        double cc = c * c;
        return sqrt(4 * aa * bb - pow((aa + bb - cc), 2)) / 4;
    }

    @Override
    public String toString() {
        return "삼각형의 넓이는 " + size();
    }
}
