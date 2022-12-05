package by.patapovich.factory;

import by.patapovich.model.Car;
import by.patapovich.model.Impl.FastCar;
import by.patapovich.model.Impl.FastShip;
import by.patapovich.model.Ship;

public class FastTransportFactory implements TransportFactory{
    @Override
    public Car creteCar() {
        return new FastCar();
    }

    @Override
    public Ship createShip() {
        return new FastShip();
    }
}
