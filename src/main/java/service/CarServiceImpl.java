package service;

import model.Car;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public String getCarsFromList(List<Car> cars, int count, Model model) {
        List<Car> outCars = new ArrayList<>();
        count = Math.min(count, cars.size());

        for (int i = 0; i < count; i++) { outCars.add(cars.get(i)); }
        model.addAttribute("cars", outCars);

        return "cars";
    }
}
