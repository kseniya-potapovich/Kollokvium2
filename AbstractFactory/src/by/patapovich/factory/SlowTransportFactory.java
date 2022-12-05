package by.patapovich.factory;

import by.patapovich.model.Car;
import by.patapovich.model.Impl.SlowCar;
import by.patapovich.model.Impl.SlowShip;
import by.patapovich.model.Ship;

public class SlowTransportFactory implements TransportFactory{
    @Override
    public Car creteCar() {
        return new SlowCar();
    }

    @Override
    public Ship createShip() {
        return new SlowShip();
    }
}
