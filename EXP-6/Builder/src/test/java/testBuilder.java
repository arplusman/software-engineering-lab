import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testBuilder {

    @Test
    void testSportsCar() {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        car.setFuel(23.4);

        assertEquals(car.getCarType(), CarType.SPORTS_CAR);
        assertEquals(car.getFuel(), 23.4);
        assertEquals(car.getSeats(), 2);
    }

    @Test
    void testManualSUVCar() {
        Director director = new Director();
        CarManualBuilder builder = new CarManualBuilder();
        director.constructSUV(builder);
        Manual manual = builder.getResult();

        assertEquals(manual.print(), "Type of car: SUV\n" +
                "Count of seats: 4\n" +
                "Engine: volume - 2.5; mileage - 0.0\n" +
                "Transmission: MANUAL\n" +
                "Trip Computer: N/A\n" +
                "GPS Navigator: Functional\n");
    }

}
