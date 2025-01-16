package rent.service;

import rent.domain.Car;

public interface RentService {

    Car[] mapStringToCar(String cars);

    String generateReport(Car[] carArray);
}
