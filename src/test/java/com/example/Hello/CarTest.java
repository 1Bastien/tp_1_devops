package com.example.Hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void testCarConstructor() {
        Car car = new Car("ABC123", "Toyota", 15000.0);
        assertEquals("ABC123", car.getPlateNumber());
        assertEquals("Toyota", car.getBrand());
        assertEquals(15000.0, car.getPrice());
    }

    @Test
    public void testCarServiceAddAndFind() {
        CarService service = new CarService();
        Car car = new Car("XYZ789", "Renault", 12000.0);
        service.addCar(car);

        Car found = service.findByPlateNumber("XYZ789");
        assertNotNull(found);
        assertEquals("Renault", found.getBrand());
    }

    @Test
    public void testCarServiceGetCars() {
        CarService service = new CarService();
        service.addCar(new Car("AA001", "Peugeot", 11000.0));
        service.addCar(new Car("BB002", "Citroën", 9500.0));

        assertEquals(2, service.getCars().size());
    }
}
