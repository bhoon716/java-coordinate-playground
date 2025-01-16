package rent;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import rent.domain.*;
import rent.service.RentCompany;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

// 최소 요구사항 만족 테스트
public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    RentCompany company;

    @BeforeEach
    void setUp() {
        company = RentCompany.create();
    }

    @Test
    void createTest() {

        assertThat(company).isNotNull();
        assertThat(company).isInstanceOf(RentCompany.class);
    }

//    @Test
//    void addCarTest() {
//
//        boolean result = company.addCar(new Sonata(200));
//
//        assertThat(result).isTrue();
//    }

    @Test
    void mapStringToCar() {
        String cars = "Sonata:100,K5:200,Avante:300";

        List<Car> carList = company.mapStringToCar(cars);

        assertThat(carList.size()).isEqualTo(3);
        assertThat(carList.get(0).getName()).isEqualTo("Sonata");
        assertThat(carList.get(0).getTripDistance()).isEqualTo(100);
        assertThat(carList.get(1).getName()).isEqualTo("K5");
        assertThat(carList.get(1).getTripDistance()).isEqualTo(200);
        assertThat(carList.get(2).getName()).isEqualTo("Avante");
        assertThat(carList.get(2).getTripDistance()).isEqualTo(300);
    }

    @Test
    public void report() throws Exception {
        List<Car> carList = new ArrayList<>();
        carList.add(new Sonata(150));
        carList.add(new K5(260));
        carList.add(new Sonata(120));
        carList.add(new Avante(300));
        carList.add(new K5(390));

        String report = company.generateReport(carList);

        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );
    }
}