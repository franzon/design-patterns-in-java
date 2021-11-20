package creational.factory;

class TransportFactory {

    public static Transport makeTransport(TransportType type) {
        return switch (type) {
            case TRUCK -> new Truck();
            case SHIP -> new Ship();
        };
    }
}
