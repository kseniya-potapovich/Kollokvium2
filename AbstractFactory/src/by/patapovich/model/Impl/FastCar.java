package by.patapovich.model.Impl;

import by.patapovich.model.Car;

public class FastCar implements Car {
    @Override
    public void accelerate() {
        System.out.println("Fast accelerate");
    }
}
