package coord2.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {


    @Test
    @DisplayName("포인트 생성 - 성공")
    void createPoint() {
        int x = 10, y = 20;

        Point point = new Point(x, y);

        assertThat(point).isNotNull();
        assertThat(point).isInstanceOf(Point.class);
    }

    @Test
    @DisplayName("포인트 생성 - 실패")
    void createPointFail() {
        int x = 10, y = 40;

        assertThrows(IllegalArgumentException.class, () -> {
            new Point(x, y);
        });
    }

    @Test
    void calcDistance(){
        Point p1 = new Point(10, 10);
        Point p2 = new Point(14, 15);

        double distance = p1.calcDistance(p2);

        assertThat(distance).isEqualTo(6.403124, offset(0.00099));
    }
}