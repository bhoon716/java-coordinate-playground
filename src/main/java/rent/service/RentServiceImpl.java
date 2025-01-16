package rent.service;

import rent.domain.Car;

public class RentServiceImpl implements RentService {

    @Override
    public Car[] mapStringToCar(String cars) {
        return new Car[0];
    }

    @Override
    public String generateReport(Car[] carArray) {
        return "";
    }
}
