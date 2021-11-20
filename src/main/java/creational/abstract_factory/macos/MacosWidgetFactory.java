package creational.abstract_factory.macos;

import creational.abstract_factory.Button;
import creational.abstract_factory.Input;
import creational.abstract_factory.WidgetFactory;
import creational.abstract_factory.linux.LinuxButton;
import creational.abstract_factory.linux.LinuxInput;

public class MacosWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new MacosButton();
    }

    @Override
    public Input createInput() {
        return new MacosInput();
    }
}
