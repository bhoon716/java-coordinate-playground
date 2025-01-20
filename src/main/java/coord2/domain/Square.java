package coord2.domain;

import coord2.exception.IllegalSquareException;

public class Square implements Shape {

    private final Point[] points;

    public Square(Point[] points) {
        validate(points);
        this.points = points;
    }

    private static void validate(Point[] points) {
        if (points.length != 4) {
            throw new IllegalSquareException();
        }
        if ((points[0].calcDistance(points[1]) != points[2].calcDistance(points[3]))
                || (points[0].calcDistance(points[2]) != points[1].calcDistance(points[3]))) {
            throw new IllegalSquareException();
        }
    }

    @Override
    public double size() {
        return 0;
    }
}
