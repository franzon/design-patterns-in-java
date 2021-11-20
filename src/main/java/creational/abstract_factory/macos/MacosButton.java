package creational.abstract_factory.macos;

import creational.abstract_factory.Button;

public class MacosButton implements Button {

    @Override
    public String getLabel() {
        return "macOS button";
    }
}
