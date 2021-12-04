package structural.composite;

import java.util.ArrayList;
import java.util.List;

class Container implements Widget {

    private final List<Widget> children = new ArrayList<>();

    public void addChildren(Widget widget) {
        children.add(widget);
    }

    public int getNumberOfChildrens() {
        int numberOfChildrens = 0;

        for (Widget child : children)
            if (child instanceof Container container)
                numberOfChildrens += container.getNumberOfChildrens() + 1;
            else
                numberOfChildrens++;

        return numberOfChildrens;
    }

    @Override
    public void draw() {
        children.forEach(Widget::draw);
    }
}
