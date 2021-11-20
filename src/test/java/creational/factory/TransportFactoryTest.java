package creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TransportFactoryTest {

    @Test
    void shouldCreateAShip() {
        Transport ship = TransportFactory.makeTransport(TransportType.SHIP);

        assertTrue(ship instanceof Ship);
        assertEquals("Ship", ship.getDescription());
    }

    @Test
    void shouldCreateATruck() {
        Transport truck = TransportFactory.makeTransport(TransportType.TRUCK);

        assertTrue(truck instanceof Truck);
        assertEquals("Truck", truck.getDescription());
    }
}
