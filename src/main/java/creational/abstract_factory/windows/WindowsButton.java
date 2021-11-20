package creational.abstract_factory.windows;

import creational.abstract_factory.Button;

public class WindowsButton implements Button {

    @Override
    public String getLabel() {
        return "Windows button";
    }
}
