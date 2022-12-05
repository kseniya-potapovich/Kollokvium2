package by.patapovich.model.Impl;

import by.patapovich.model.Ship;

public class SlowShip implements Ship {
    @Override
    public void go() {
        System.out.println("Slow go");
    }
}
