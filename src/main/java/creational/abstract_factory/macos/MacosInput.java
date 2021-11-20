package creational.abstract_factory.macos;

import creational.abstract_factory.Input;

public class MacosInput implements Input {

    @Override
    public String getText() {
        return "macOS input";
    }
}
