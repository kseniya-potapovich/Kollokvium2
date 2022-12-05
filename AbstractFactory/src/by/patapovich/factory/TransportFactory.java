package by.patapovich.factory;

import by.patapovich.model.Car;
import by.patapovich.model.Ship;

public interface TransportFactory {
    Car creteCar();
    Ship createShip();

}
