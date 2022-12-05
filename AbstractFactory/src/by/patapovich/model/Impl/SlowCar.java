package by.patapovich.model.Impl;

import by.patapovich.model.Car;

public class SlowCar implements Car {

    @Override
    public void accelerate() {
        System.out.println("Slow accelerate");
    }
}
