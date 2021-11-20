package creational.factory_method;

abstract class Logistics {

    String doOperation() {
        Transport transport = createTransport();

        return transport.getDescription();
    }

    abstract Transport createTransport();
}
