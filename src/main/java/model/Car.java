package model;

import java.util.Objects;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() { return Objects.hash(year, model, price); }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
