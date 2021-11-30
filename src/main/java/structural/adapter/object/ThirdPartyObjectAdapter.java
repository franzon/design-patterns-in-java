package structural.adapter.object;

import structural.adapter.object.thirdparty.Rhombus;
import structural.adapter.object.thirdparty.ThirdPartyShape;
import structural.adapter.object.thirdparty.Triangle;

public class ThirdPartyObjectAdapter implements Shape {

    private final ThirdPartyShape adaptee;

    public ThirdPartyObjectAdapter(ThirdPartyShape adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void draw() {
        adaptee.drawShape();
    }

    @Override
    public String description() {
        if (adaptee instanceof Triangle)
            return "Triangle";
        else if (adaptee instanceof Rhombus)
            return "Rhombus";

        return "Unknown";
    }
}
