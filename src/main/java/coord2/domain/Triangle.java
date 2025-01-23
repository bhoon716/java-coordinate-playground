package coord2.domain;

import coord2.exception.IllegalTriangleException;

public class Triangle implements Shape {

    private final Point[] points;

    public Triangle(Point[] points) {
        validate(points);
        this.points = points;
    }

    private void validate(Point[] points) {
        if(points.length != 3){
            throw new IllegalTriangleException();
        }
        if(points[0].equals(points[1]) || points[1].equals(points[2])
                || points[0].equals(points[2])){
            throw new IllegalTriangleException();
        }
    }

    @Override
    public double size() {
        return 0;
    }

    @Override
    public String toString(){
        return "삼각형의 넓이는 " + size();
    }
}
