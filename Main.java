import modelTransport.Bicycle;
import modelTransport.Car;
import modelTransport.Truck;
import modelTransport.WheeledTransport;


public class Main {
    public static void main(String[] args) {
        WheeledTransport[] transports = new WheeledTransport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };
        for (WheeledTransport transport : transports) {
            transport.check();
            System.out.println();
        }
    }
}