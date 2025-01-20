package coord2.domain;

import coord2.exception.IllegalSquareException;

import static coord2.constant.CoordConstant.MAX;

public class Square implements Shape {

    private final Point[] points;

    public Square(Point[] points) {
        validate(points);
        this.points = points;
    }

    private void validate(Point[] points) {
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
        int maxX = 0, maxY = 0;
        int minX = MAX, minY = MAX;
        for (Point point : points) {
            maxX = Math.max(maxX, point.getX());
            maxY = Math.max(maxY, point.getY());
            minX = Math.min(minX, point.getX());
            minY = Math.min(minY, point.getY());
        }

        int width = minX - maxX;
        int height = maxY - minY;

        return width * height;
    }

    @Override
    public String toString(){
        return "사각형 넓이는 " + size();
    }
}
