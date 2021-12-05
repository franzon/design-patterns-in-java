package structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoratorTest {

    @Test
    void shouldUseSimpleDataSource() {
        DataSource dataSource = new SimpleDataSource();
        dataSource.write("test");

        assertEquals("test", dataSource.read());
    }

    @Test
    void shouldEncryptText() {
        DataSource dataSource = new EncryptionDecorator(new SimpleDataSource());
        dataSource.write("test");

        assertEquals("test", dataSource.read());
    }

    @Test
    void shouldReverseAndEncryptText() {
        DataSource dataSource = new ReverseDecorator(new EncryptionDecorator(new SimpleDataSource()));
        dataSource.write("test");

        assertEquals("test", dataSource.read());
    }
}
