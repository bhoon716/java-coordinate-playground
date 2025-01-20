package coord2.controller;

import coord2.domain.Line;
import coord2.domain.Point;
import coord2.domain.Shape;
import coord2.domain.Square;
import coord2.exception.IllegalInputPatternException;

public class ShapeFactory {

    public static Shape create(Point[] points){
        if(points.length == 2){
            return new Line(points);
        }
        if(points.length == 4){
            return new Square(points);
        }
        throw new IllegalInputPatternException();
    }
}
