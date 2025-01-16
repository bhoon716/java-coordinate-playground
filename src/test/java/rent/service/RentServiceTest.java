package rent.service;

import org.junit.jupiter.api.Test;
import rent.domain.Car;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RentServiceTest {

    RentService rentService = new RentServiceImpl();

    @Test
    void mapStringToCar() {
        String cars = "Sonata:100,K5:200,Avante:300";

        List<Car> carList = rentService.mapStringToCar(cars);

        assertThat(carList.size()).isEqualTo(3);
        assertThat(carList.get(0).getName()).isEqualTo("Sonata");
        assertThat(carList.get(0).getTripDistance()).isEqualTo(100);
        assertThat(carList.get(1).getName()).isEqualTo("K5");
        assertThat(carList.get(1).getTripDistance()).isEqualTo(200);
        assertThat(carList.get(2).getName()).isEqualTo("Avante");
        assertThat(carList.get(2).getTripDistance()).isEqualTo(300);
    }

    @Test
    void generateReport() {
    }
}