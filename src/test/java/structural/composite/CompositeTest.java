package structural.composite;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompositeTest {

    @Test
    void shouldDrawAllSubWidgets() {
        Container container = new Container();

        Container subcontainer1 = new Container();
        subcontainer1.addChildren(new Button());
        subcontainer1.addChildren(new Input());

        Container subcontainer2 = new Container();
        subcontainer2.addChildren(new Button());

        container.addChildren(subcontainer1);
        container.addChildren(subcontainer2);
        container.addChildren(new Input());

        assertEquals(6, container.getNumberOfChildrens());
    }
}
