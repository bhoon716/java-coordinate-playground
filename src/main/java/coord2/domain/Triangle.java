package coord2.domain;

public class Triangle implements Shape {

    private final Point[] points;

    public Triangle(Point[] points) {
        validate(points);
        this.points = points;
    }

    private void validate(Point[] points) {

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
