package rent.service;

import org.junit.jupiter.api.Test;
import rent.domain.Car;

import static org.assertj.core.api.Assertions.assertThat;

class RentServiceTest {

    RentService rentService = new RentServiceImpl();

    @Test
    void mapStringToCar() {
        String cars = "Sonata:100,K5:200,Avante:300";

        Car[] toCar = rentService.mapStringToCar(cars);

        assertThat(toCar.length).isEqualTo(3);
        assertThat(toCar[0].getName()).isEqualTo("Sonata");
        assertThat(toCar[0].getTripDistance()).isEqualTo(100);
        assertThat(toCar[1].getName()).isEqualTo("K5");
        assertThat(toCar[1].getTripDistance()).isEqualTo(200);
        assertThat(toCar[2].getName()).isEqualTo("Avante");
        assertThat(toCar[2].getTripDistance()).isEqualTo(300);
    }

    @Test
    void generateReport() {
    }
}