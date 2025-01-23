package coord2.controller;

import coord2.domain.*;
import coord2.exception.IllegalInputPatternException;

public class ShapeFactory {

    public static Shape create(Point[] points){
        if(points.length == 2){
            return new Line(points);
        }
        if(points.length == 4){
            return new Square(points);
        }
        if(points.length == 3){
            return new Triangle(points);
        }
        throw new IllegalInputPatternException();
    }
}
