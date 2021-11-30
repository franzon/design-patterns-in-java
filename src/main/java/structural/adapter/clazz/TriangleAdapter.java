package structural.adapter.clazz;

import structural.adapter.clazz.thirdparty.Triangle;

class TriangleAdapter extends Triangle implements Shape {

    public TriangleAdapter(double a, double b, double c) {
        super(a, b, c);
    }

    @Override
    public void draw() {
        this.drawShape();
    }

    @Override
    public String description() {
        return "Triangle";
    }
}
