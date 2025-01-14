package rent.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    double tripDist1 = 100.0;
    double tripDist2 = 200.0;
    double tripDist3 = 300.0;

    Car car1 = new Sonata(tripDist1);
    Car car2 = new K5(tripDist2);
    Car car3 = new Avante(tripDist3);

    @Test
    void getDistancePerLiter() {
        double distancePerLiter1 = car1.getDistancePerLiter();
        double distancePerLiter2 = car2.getDistancePerLiter();
        double distancePerLiter3 = car3.getDistancePerLiter();

        assertThat(distancePerLiter1).isEqualTo(10.0);
        assertThat(distancePerLiter2).isEqualTo(13.0);
        assertThat(distancePerLiter3).isEqualTo(15.0);
    }

    @Test
    void getTripDistance() {
        double tripDistance1 = car1.getTripDistance();
        double tripDistance2 = car2.getTripDistance();
        double tripDistance3 = car3.getTripDistance();

        assertThat(tripDistance1).isEqualTo(100.0);
        assertThat(tripDistance2).isEqualTo(200.0);
        assertThat(tripDistance3).isEqualTo(300.0);
    }

    @Test
    void getName() {
        String name1 = car1.getName();
        String name2 = car2.getName();
        String name3 = car3.getName();

        assertThat(name1).isEqualTo("Sonata");
        assertThat(name2).isEqualTo("K5");
        assertThat(name3).isEqualTo("Avante");
    }

    @Test
    void getChargeQuantity() {
        double chargeQuantity1 = car1.getChargeQuantity();
        double chargeQuantity2 = car2.getChargeQuantity();
        double chargeQuantity3 = car3.getChargeQuantity();

        assertThat(chargeQuantity1).isEqualTo(tripDist1 / 10.0);
        assertThat(chargeQuantity2).isEqualTo(tripDist2 / 13.0);
        assertThat(chargeQuantity3).isEqualTo(tripDist3 / 15.0);
    }
}