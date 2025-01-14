package rent;

import org.junit.jupiter.api.Test;
import rent.domain.*;

import static org.assertj.core.api.Assertions.assertThat;

// 최소 요구사항 만족 테스트
public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");


    @Test
    void createTest() {
        RentCompany company = RentCompany.create();

        assertThat(company).isNotNull();
        assertThat(company).isInstanceOf(RentCompany.class);
    }

    @Test
    void addCarTest() {
        RentCompany company = RentCompany.create();

        boolean result = company.addCar(new Sonata(200));

        assertThat(result).isTrue();
    }

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
                "Sonata : 15리터" + NEWLINE +
                        "K5 : 20리터" + NEWLINE +
                        "Sonata : 12리터" + NEWLINE +
                        "Avante : 20리터" + NEWLINE +
                        "K5 : 30리터" + NEWLINE
        );
    }
}