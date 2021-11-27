package creational.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class PrototypeTest {

    @Test
    void shouldCloneTheObject() {
        House house1 = new House(new Floor(10), new Ceil("black"));
        House house2 = house1.copy();

        assertNotEquals(house1.getCeil(), house2.getCeil());
        assertEquals(house1.getCeil().getColor(), house2.getCeil().getColor());
    }
}
