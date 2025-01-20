package coord2.domain;

public class Grid {

    private final Point[][] grid;

    private Grid(Point[][] grid) {
        this.grid = grid;
    }

    public static Grid create(int size){
        validate(size);
        return new Grid(new Point[size+1][size+1]);
    }

    private static void validate(int size) {

    }
}
