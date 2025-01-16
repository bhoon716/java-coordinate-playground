package rent.view;

public class OutputViewImpl implements OutputView {

    @Override
    public void printEnterRentCar() {
        System.out.println("렌트할 차량과 여행 이동거리를 입력하세요 (차량:거리)");
        System.out.println("ex) Sonata:100,K5:200");
    }

    @Override
    public void printReport(String report) {
        System.out.println("렌트 차량 보고서 \n" + report);
    }
}
