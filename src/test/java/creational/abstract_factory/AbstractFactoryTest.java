package creational.abstract_factory;

import creational.abstract_factory.linux.LinuxButton;
import creational.abstract_factory.linux.LinuxInput;
import creational.abstract_factory.linux.LinuxWidgetFactory;
import creational.abstract_factory.macos.MacosButton;
import creational.abstract_factory.macos.MacosInput;
import creational.abstract_factory.macos.MacosWidgetFactory;
import creational.abstract_factory.windows.WindowsButton;
import creational.abstract_factory.windows.WindowsInput;
import creational.abstract_factory.windows.WindowsWidgetFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AbstractFactoryTest {

    @Test
    void shouldCreateWindowsWidgets() {
        WidgetFactory factory = new WindowsWidgetFactory();

        Button button = factory.createButton();
        Input input = factory.createInput();

        assertTrue(button instanceof WindowsButton);
        assertTrue(input instanceof WindowsInput);
    }

    @Test
    void shouldCreateLinuxWidgets() {
        WidgetFactory factory = new LinuxWidgetFactory();

        Button button = factory.createButton();
        Input input = factory.createInput();

        assertTrue(button instanceof LinuxButton);
        assertTrue(input instanceof LinuxInput);
    }

    @Test
    void shouldCreateMacosWidgets() {
        WidgetFactory factory = new MacosWidgetFactory();

        Button button = factory.createButton();
        Input input = factory.createInput();

        assertTrue(button instanceof MacosButton);
        assertTrue(input instanceof MacosInput);
    }
}
