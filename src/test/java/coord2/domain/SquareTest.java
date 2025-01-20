package coord2.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void createTest() {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(8, 2);
        Point p4 = new Point(8, 8);
        Point[] points = {p1, p2, p3, p4};

        Square square = new Square(points);

        assertThat(square).isNotNull();
        assertThat(square).isInstanceOf(Square.class);
    }

    @Test
    @DisplayName("사각형 생성 실패 테스트 - 직사각형 아님")
    void createFailTest() {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(8, 2);
        Point p4 = new Point(1, 8);
        Point[] points = {p1, p2, p3, p4};

        assertThrows(IllegalArgumentException.class, () -> {
            new Square(points);
        });
    }

    @Test
    @DisplayName("사각형 생성 실패 테스트 - 같은 점 존재")
    void createFailTest2() {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(8, 2);
        Point p4 = new Point(8, 2);
        Point[] points = {p1, p2, p3, p4};

        assertThrows(IllegalArgumentException.class, () -> {
            new Square(points);
        });
    }

    @Test
    void sizeTest() {
        Point p1 = new Point(2, 2);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(8, 2);
        Point p4 = new Point(8, 8);
        Point[] points = {p1, p2, p3, p4};

        Square square = new Square(points);
        double size = square.size();

        assertThat(size).isEqualTo(36);
    }
}