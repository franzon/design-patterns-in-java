package creational.abstract_factory.windows;

import creational.abstract_factory.Input;

public class WindowsInput implements Input {

    @Override
    public String getText() {
        return "Windows input";
    }
}
