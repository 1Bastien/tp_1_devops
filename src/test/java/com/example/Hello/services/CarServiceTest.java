package com.example.Hello.services;

import com.example.Hello.Car;
import com.example.Hello.CarService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarServiceTest {

    @Test
    public void testAddAndFindCar() {
        CarService service = new CarService();
        Car car = new Car("XYZ789", "Renault", 12000.0);
        service.addCar(car);

        Car found = service.findByPlateNumber("XYZ789");
        assertNotNull(found);
        assertEquals("Renault", found.getBrand());
    }

    @Test
    public void testGetCars() {
        CarService service = new CarService();
        service.addCar(new Car("AA001", "Peugeot", 11000.0));
        service.addCar(new Car("BB002", "Citroën", 9500.0));

        assertEquals(2, service.getCars().size());
    }

    @Test
    public void testFindByPlateNumberNotFound() {
        CarService service = new CarService();
        Car found = service.findByPlateNumber("UNKNOWN");
        assertNull(found);
    }
}
