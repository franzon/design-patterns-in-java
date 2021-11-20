package creational.abstract_factory.linux;

import creational.abstract_factory.Button;

public class LinuxButton implements Button {

    @Override
    public String getLabel() {
        return "Linux button";
    }
}
