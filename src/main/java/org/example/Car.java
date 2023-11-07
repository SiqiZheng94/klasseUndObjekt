package org.example;

import java.util.Objects;

public class Car {
    String brand;
    String model;
    String color;
    int year;
    float speed;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return year == car.year && Float.compare(speed, car.speed) == 0 && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, year, speed);
    }

    public void carStart(){
        System.out.println("Car started.");
    }
    public void accelerate(){
        this.speed = speed+10;
        System.out.println("The speed of car now is " + this.speed + " km/h.");

    }
}
