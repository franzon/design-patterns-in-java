package structural.adapter.clazz;

import structural.adapter.clazz.thirdparty.Rhombus;

class RhombusAdapter extends Rhombus implements Shape {
    public RhombusAdapter(double a, double b) {
        super(a, b);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public String description() {
        return "Rhombus";
    }
}
