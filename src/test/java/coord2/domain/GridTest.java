package coord2.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GridTest {

    @Test
    void createTest() {
        int size = 24;

        Grid grid = new Grid(size);

        assertThat(grid).isNotNull();
        assertThat(grid).isInstanceOf(Grid.class);
    }
}