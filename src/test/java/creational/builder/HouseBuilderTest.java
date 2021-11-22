package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class HouseBuilderTest {

    @Test
    void shouldCreateAHouse() {
        House house = new HouseBuilder(new Floor())
                .withCeil(new Ceil())
                .withDoor(new Door())
                .withWindow(new Window())
                .withPool(new Pool())
                .build();

        assertNotNull(house.getCeil());
    }
}
