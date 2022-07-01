package service;

import model.Car;

import java.util.List;

public interface CarService {
    Car getCarsFromList(List<Car> cars, int count);
}
