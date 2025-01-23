package coord2.domain;

import coord2.exception.IllegalTriangleException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TriangleTest {

    @Test
    void create() {
        Point[] points = new Point[]{new Point(1, 2), new Point(4, 7), new Point(2, 9)};

        Triangle triangle = new Triangle(points);

        assertThat(triangle).isNotNull();
        assertThat(triangle).isInstanceOf(Triangle.class);
    }

    @Test
    @DisplayName("삼각형 생성 실패 - 중복 좌표")
    void createFail() {
        Point[] points = new Point[]{new Point(1, 2), new Point(1, 2), new Point(2, 9)};

        assertThrows(IllegalTriangleException.class, () -> {
            new Triangle(points);
        });
    }

    @Test
    void size() {
//        (10,10)-(14,15)-(20,8)
        Point[] points = new Point[]{
                new Point(10, 10),
                new Point(14, 15),
                new Point(20, 8)
        };
        Triangle triangle = new Triangle(points);

        double size = triangle.size();

        assertThat(size).isEqualTo(29.0);
    }

}