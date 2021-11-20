package creational.abstract_factory.windows;

import creational.abstract_factory.Button;
import creational.abstract_factory.Input;
import creational.abstract_factory.WidgetFactory;

public class WindowsWidgetFactory implements WidgetFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Input createInput() {
        return new WindowsInput();
    }
}
