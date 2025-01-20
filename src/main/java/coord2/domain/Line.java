package coord2.domain;

import coord2.exception.IllegalLineException;

public class Line implements Shape {

    private final Point[] points;

    private Line(Point[] points) {
        this.points = points;
    }

    public static Line create(Point[] points){
        validate(points);
        return new Line(points);
    }

    private static void validate(Point[] points) {
        if(points.length != 2 || points[0].equals(points[1])){
            throw new IllegalLineException();
        }
    }

    @Override
    public double size() {
        return 0;
    }
}
