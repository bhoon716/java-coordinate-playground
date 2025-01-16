package rent.domain;

import rent.exception.IllegalTripDistanceException;

public abstract class Car {

    private double tripDistance;

    public Car(double tripDistance) {
        validate(tripDistance);
        this.tripDistance = tripDistance;
    }

    private void validate(double tripDistance) {
        if(tripDistance < 0){
            throw new IllegalTripDistanceException();
        }
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    public abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    public double getTripDistance() {
        return tripDistance;
    }

    /**
     * 차종의 이름
     */
    public abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
     */
    public double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}

