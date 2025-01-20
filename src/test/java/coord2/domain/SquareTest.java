package coord2.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void createTest() {
        Point p1 = Point.at(2, 2);
        Point p2 = Point.at(2, 8);
        Point p3 = Point.at(8, 2);
        Point p4 = Point.at(8, 8);
        Point[] points = {p1, p2, p3, p4};

        Square square = Square.create(points);

        assertThat(square).isNotNull();
        assertThat(square).isInstanceOf(Square.class);
    }

    @Test
    @DisplayName("사각형 생성 실패 테스트 - 직사각형 아님")
    void createFailTest() {
        Point p1 = Point.at(2, 2);
        Point p2 = Point.at(2, 8);
        Point p3 = Point.at(8, 2);
        Point p4 = Point.at(8, 3);
        Point[] points = {p1, p2, p3, p4};

        assertThrows(IllegalArgumentException.class, () -> {
            Square.create(points);
        });
    }

    @Test
    @DisplayName("사각형 생성 실패 테스트 - 같은 점 존재")
    void createFailTest2() {
        Point p1 = Point.at(2, 2);
        Point p2 = Point.at(2, 8);
        Point p3 = Point.at(2, 2);
        Point p4 = Point.at(8, 3);
        Point[] points = {p1, p2, p3, p4};

        assertThrows(IllegalArgumentException.class, () -> {
            Square.create(points);
        });
    }

    @Test
    void sizeTest() {
        Point p1 = Point.at(2, 2);
        Point p2 = Point.at(2, 8);
        Point p3 = Point.at(8, 2);
        Point p4 = Point.at(8, 8);
        Point[] points = {p1, p2, p3, p4};

        Square square = Square.create(points);
        double size = square.size();

        assertThat(size).isEqualTo(36);
    }
}