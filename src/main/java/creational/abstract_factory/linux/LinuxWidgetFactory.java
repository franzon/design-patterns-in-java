package creational.abstract_factory.linux;

import creational.abstract_factory.Button;
import creational.abstract_factory.Input;
import creational.abstract_factory.WidgetFactory;

public class LinuxWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Input createInput() {
        return new LinuxInput();
    }
}
