package coord2.domain;

public class Square implements Shape {

    private final Point[] points;

    private Square(Point[] points) {
        this.points = points;
    }

    public static Square create(Point[] points){
        validate(points);
        return new Square(points);
    }

    private static void validate(Point[] points) {

    }

    @Override
    public double size() {
        return 0;
    }
}
