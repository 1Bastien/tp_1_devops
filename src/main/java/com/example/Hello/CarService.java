package com.example.Hello;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> getCars() {
        return cars;
    }

    public Car findByPlateNumber(String plateNumber) {
        return cars.stream()
                .filter(c -> c.getPlateNumber().equals(plateNumber))
                .findFirst()
                .orElse(null);
    }
}
