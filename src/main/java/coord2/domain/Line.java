package coord2.domain;

import coord2.exception.IllegalLineException;

public class Line implements Shape {

    private final Point[] points;

    public Line(Point[] points) {
        validate(points);
        this.points = points;
    }

    private void validate(Point[] points) {
        if(points.length != 2 || points[0].equals(points[1])){
            throw new IllegalLineException();
        }
    }

    @Override
    public double size() {
        return points[0].calcDistance(points[1]);
    }

    @Override
    public String toString(){
        return "두 점 사이의 거리 " + size();
    }
}
