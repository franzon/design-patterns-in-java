package structural.adapter.object;

import java.util.ArrayList;
import java.util.List;

class Client {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void draw() {
        shapes.forEach(Shape::draw);
    }
}
