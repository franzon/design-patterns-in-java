package structural.adapter.clazz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleAdapterTest {

    @Test
    void shouldReturnTheDescription() {
        TriangleAdapter triangle = new TriangleAdapter(1.0, 1.0, 1.0);

        assertEquals("Triangle", triangle.description());
    }
}
