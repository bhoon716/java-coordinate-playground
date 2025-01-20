package coord2.controller;

import coord2.domain.Point;
import coord2.view.InputView;
import coord2.view.InputViewImpl;
import coord2.view.OutputViewImpl;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CoordControllerTest {

    CoordController coordController = new CoordController(new InputViewImpl(), new OutputViewImpl());

    @Test
    void mapStringToPoints(){
        String input = "(10,10)-(22,10)-(22,18)-(10,18)";
        Point[] expected = {new Point(10, 10), new Point(22, 10), new Point(22, 18), new Point(10, 18)};

        Point[] result = coordController.mapStringToPoints(input);

        assertThat(result.length).isEqualTo(4);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void runTest(){
        coordController = new CoordController(new MockInputView(), new OutputViewImpl());

        coordController.run();
    }

    class MockInputView implements InputView {

        @Override
        public String readPoints() {
            return "(10,10)-(22,10)-(22,18)-(10,18)";
        }
    }
}