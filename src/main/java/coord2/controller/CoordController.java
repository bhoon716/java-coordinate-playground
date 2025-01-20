package coord2.controller;

import coord2.domain.Point;
import coord2.view.InputView;
import coord2.view.OutputView;

import java.util.Arrays;

import static coord2.constant.CoordConstant.*;

public class CoordController {

    private final InputView inputView;
    private final OutputView outputView;

    public CoordController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public Point[] mapStringToPoints(String str) {
        String[] points = str.split(POINT_DELIMITER);

        return Arrays.stream(points)
                .map(this::convertToPoint)
                .toArray(Point[]::new);
    }

    private Point convertToPoint(String pointStr) {
        String cleaned = pointStr
                .replace(OPEN_BRACKET, NULL_STRING)
                .replace(CLOSE_BRACKET, NULL_STRING);

        String[] coordinates = cleaned.split(XY_DELIMITER);

        int x = Integer.parseInt(coordinates[0].trim());
        int y = Integer.parseInt(coordinates[1].trim());
        return new Point(x, y);
    }
}
