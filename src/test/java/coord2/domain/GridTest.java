package coord2.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GridTest {

    @Test
    void createTest() {
        Grid grid = new Grid();

        assertThat(grid).isNotNull();
        assertThat(grid).isInstanceOf(Grid.class);
    }

    @Test
    void markTest(){
        Grid grid = new Grid();
        Point p1 = new Point(1, 20);
        Point p2 = new Point(20, 3);
        Point[] points = {p1, p2};

        grid.mark(points);

        System.out.println(grid.draw());
    }
}