package service;

import model.Car;
import org.springframework.ui.Model;

import java.util.List;

public interface CarService {
    String getCarsFromList(List<Car> cars, int count, Model model);
}
