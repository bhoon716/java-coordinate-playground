package coord2.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {


    @Test
    @DisplayName("포인트 생성 - 성공")
    void createPoint() {
        int x = 10, y = 20;

        Point point = Point.at(x, y);

        assertThat(point).isNotNull();
        assertThat(point).isInstanceOf(Point.class);
    }

    @Test
    @DisplayName("포인트 생성 - 실패")
    void createPointFail() {
        int x = 10, y = 40;

        assertThrows(IllegalArgumentException.class, () -> {
            Point.at(x, y);
        });
    }
}