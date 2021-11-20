package creational.abstract_factory.linux;

import creational.abstract_factory.Input;

public class LinuxInput implements Input {

    @Override
    public String getText() {
        return "Linux input";
    }
}
