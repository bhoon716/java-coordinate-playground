package coord2.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LineTest {

    @Test
    void createTest() {
        Point p1 = Point.at(2, 10);
        Point p2 = Point.at(4, 20);
        Point[] points = {p1, p2};

        Line line = Line.create(points);

        assertThat(line).isNotNull();
        assertThat(line).isInstanceOf(Line.class);
    }

    @Test
    @DisplayName("직성 생성 실패 테스트 - 같은 점")
    void createFailTest() {
        Point p1 = Point.at(4, 10);
        Point p2 = Point.at(4, 10);
        Point[] points = {p1, p2};

        assertThrows(IllegalArgumentException.class, () -> {
            Line.create(points);
        });
    }

    @Test
    void sizeTest(){
        Point p1 = Point.at(2, 5);
        Point p2 = Point.at(2, 10);
        Point[] points = {p1, p2};

        Line line = Line.create(points);
        double size = line.size();

        assertThat(size).isEqualTo(5);
    }
}