package com.example.Hello;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RentServiceRest {

    private final CarService carService;

    public RentServiceRest(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car car) {
        carService.addCar(car);
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/cars/{plateNumber}")
    public Car getCarByPlateNumber(@PathVariable String plateNumber) {
        return carService.findByPlateNumber(plateNumber);
    }
}
