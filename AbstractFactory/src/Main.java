import by.patapovich.factory.FastTransportFactory;
import by.patapovich.factory.SlowTransportFactory;
import by.patapovich.factory.TransportFactory;

public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new FastTransportFactory();
        factory.creteCar().accelerate();
        factory.createShip().go();

        factory = new SlowTransportFactory();
        factory.creteCar().accelerate();
        factory.createShip().go();
    }
}