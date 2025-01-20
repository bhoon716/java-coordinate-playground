package coord2;

import coord2.controller.CoordController;
import coord2.view.InputView;
import coord2.view.InputViewImpl;
import coord2.view.OutputView;
import coord2.view.OutputViewImpl;

public class CoordApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        while(true) {
            appConfig.run();
        }
    }

    private static class AppConfig {

        private final InputView inputView = new InputViewImpl();
        private final OutputView outputView = new OutputViewImpl();
        private final CoordController controller = new CoordController(inputView, outputView);

        public void run(){
            try {
                controller.run();
            } catch (IllegalArgumentException e){
                System.out.println("[오류] : " + e.getMessage());
            }
        }
    }
}
