package coord2.domain;

public class Grid {

    private final Point[][] grid;

    public Grid(int size) {
        validate(size);
        grid = new Point[size+1][size+1];
    }

    private static void validate(int size) {

    }
}
