package coord2.domain;

public class Grid {

    private final Point[][] grid;

    public Grid(int size) {
        grid = new Point[size+1][size+1];
    }
}
