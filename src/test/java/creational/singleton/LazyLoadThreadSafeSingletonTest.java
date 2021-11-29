package creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LazyLoadThreadSafeSingletonTest {

    @Test
    void shouldAlwaysReturnTheSameInstance() {
        LazyLoadThreadSafeSingleton instance = LazyLoadThreadSafeSingleton.getInstance();
        LazyLoadThreadSafeSingleton instance2 = LazyLoadThreadSafeSingleton.getInstance();

        assertEquals(instance, instance2);
    }
}
