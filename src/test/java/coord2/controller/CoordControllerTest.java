package coord2.controller;

import coord2.domain.Point;
import coord2.view.InputView;
import coord2.view.InputViewImpl;
import coord2.view.OutputViewImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoordControllerTest {

    CoordController coordController = new CoordController(new InputViewImpl(), new OutputViewImpl());

    @Test
    void mapStringToPoints() {
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        Point[] expected = {new Point(10, 10), new Point(22, 10), new Point(22, 18), new Point(10, 18)};

        Point[] result = coordController.mapStringToPoints(input);

        assertThat(result.length).isEqualTo(4);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    @DisplayName("사각형")
    void runTest() {
        coordController = new CoordController(new MockSquareInputView(), new OutputViewImpl());

        coordController.run();
    }

    @Test
    @DisplayName("직선")
    void runTest2() {
        coordController = new CoordController(new MockLineInputView(), new OutputViewImpl());

        coordController.run();
    }

    @Test
    @DisplayName("삼각형")
    void runTest3() {
        coordController = new CoordController(new MockTriangleInputView(), new OutputViewImpl());

        coordController.run();
    }

    static class MockSquareInputView implements InputView {

        @Override
        public String readPoints() {
            return "(10,10)-(22,10)-(22,18)-(10,18)";
        }
    }

    static class MockLineInputView implements InputView {

        @Override
        public String readPoints() {
            return "(10,10)-(22,10)";
        }
    }

    static class MockTriangleInputView implements InputView{

        @Override
        public String readPoints() {
            return "(10,10)-(14,15)-(20,8)";
        }
    }
}