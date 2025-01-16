package rent.service;

import rent.domain.Car;

import java.util.List;

public interface RentService {

    List<Car> mapStringToCar(String cars);

    String generateReport(List<Car> carArray);
}
