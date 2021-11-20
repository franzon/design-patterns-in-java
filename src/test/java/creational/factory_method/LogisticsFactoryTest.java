package creational.factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LogisticsFactoryTest {

    @Test
    void shouldCreateAShip() {
        Logistics seaLogistics = new SeaLogistics();
        Transport ship = seaLogistics.createTransport();

        assertTrue(ship instanceof Ship);
        assertEquals("Ship", ship.getDescription());
    }

    @Test
    void shouldCreateATruck() {
        Logistics roadLogistics = new RoadLogistics();
        Transport truck = roadLogistics.createTransport();

        assertTrue(truck instanceof Truck);
        assertEquals("Truck", truck.getDescription());
    }
}
