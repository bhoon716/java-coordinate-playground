package coord2.domain;

import static coord2.constant.CoordConstant.*;

public class Grid {

    private final Point[][] grid;

    public Grid() {
        grid = new Point[MAX + 1][MAX + 1];
    }

    public void mark(Point[] points) {
        for (Point point : points) {
            int x = point.getX();
            int y = point.getY();
            grid[y][x] = point;
        }
    }

    public String row(int r) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= MAX; i++) {
            if (grid[r][i] == null) {
                sb.append(BLANK);
                continue;
            }
            sb.append(MARK_SIGN);
        }
        return sb.toString();
    }

    public String draw() {
        StringBuilder sb = new StringBuilder();
        for (int i = MAX; i > 0; i -= 2) {
            sb.append(String.format("%3d", i)).append(V_LINE).append(row(i)).append(NEW_LINE);

            sb.append(BLANK).append(V_LINE).append(row(i - 1)).append(NEW_LINE);
        }

        sb.append(BLANK).append(ORIGIN);
        for (int i = 0; i <= MAX + 1; i++) {
            sb.append(H_LINE);
        }

        sb.append(NEW_LINE).append(ZERO).append(BLANK);
        for (int i = 2; i <= MAX; i+=2) {
            sb.append(String.format("%6d", i));
        }

        return sb.toString();
    }
}
