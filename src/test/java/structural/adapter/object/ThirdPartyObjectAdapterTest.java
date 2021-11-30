package structural.adapter.object;

import org.junit.jupiter.api.Test;
import structural.adapter.object.thirdparty.ThirdPartyShape;
import structural.adapter.object.thirdparty.Triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class ThirdPartyObjectAdapterTest {

    @Test
    void shouldCallDrawShape() {
        ThirdPartyShape thirdPartyShape = spy(ThirdPartyShape.class);

        doNothing().when(thirdPartyShape).drawShape();

        ThirdPartyObjectAdapter adaptedObject = new ThirdPartyObjectAdapter(thirdPartyShape);

        adaptedObject.draw();

        verify(thirdPartyShape).drawShape();
    }

    @Test
    void shouldReturnTheTriangleDescription() {
        ThirdPartyObjectAdapter adaptedObject = new ThirdPartyObjectAdapter(new Triangle(1.0, 1.0, 1.0));

        assertEquals("Triangle", adaptedObject.description());
    }
}
