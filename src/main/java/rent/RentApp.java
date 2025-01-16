package rent;

import rent.controller.RentController;
import rent.service.RentCompany;
import rent.view.InputView;
import rent.view.InputViewImpl;
import rent.view.OutputView;
import rent.view.OutputViewImpl;

public class RentApp {

    public static void main(String[] args) {
        RentAppConfig app = new RentAppConfig();
        app.run();
    }

    static class RentAppConfig {
        InputView inputView = new InputViewImpl();
        OutputView outputView = new OutputViewImpl();
        RentCompany rentCompany = RentCompany.create();
        RentController rentController = new RentController(inputView, outputView, rentCompany);

        public void run(){
            rentController.run();
        }
    }
}
