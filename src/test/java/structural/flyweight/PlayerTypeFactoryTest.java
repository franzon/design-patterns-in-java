package structural.flyweight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTypeFactoryTest {

    @Test
    void shouldCachePlayerModels() {
        PlayerTypeFactory factory = new PlayerTypeFactory();

        PlayerModel model1 = factory.getModel(PlayerType.TERRORIST);
        PlayerModel model2 = factory.getModel(PlayerType.TERRORIST);

        assertEquals(model1, model2);
    }
}
