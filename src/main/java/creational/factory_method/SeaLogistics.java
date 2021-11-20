package creational.factory_method;

class SeaLogistics implements Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
