package model;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int year;
    private String model;
    private Long price;

    public Car() { }

    public Car(String model, Long price, int year) {
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public Long getPrice() { return price; }
    public void setPrice(Long price) { this.price = price; }
}
