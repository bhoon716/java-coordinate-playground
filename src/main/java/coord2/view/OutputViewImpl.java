package coord2.view;

public class OutputViewImpl implements OutputView {

    @Override
    public void printEnterPoints() {
        System.out.println("좌표를 입력하세요.");
    }

    @Override
    public void printGrid(String grid) {
        System.out.println(grid);
    }

    @Override
    public void printSize(String size) {
        System.out.println(size);
    }
}
