package web.controller;

import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping("/cars")
    public String printCars(ModelMap model) {
        List<Car> cars = new ArrayList<>() {{
            add(new Car("Lada", 101L, 2021));
            add(new Car("Jiguli", 100L, 1950));
            add(new Car("OpelManta", 50_000L, 1996));
            add(new Car("BatCar", 1_000_000_000L, 2023));
            add(new Car("TimeMachine", 9_999_999_999L, 1980));
        }};
        return "cars";
    }
}
