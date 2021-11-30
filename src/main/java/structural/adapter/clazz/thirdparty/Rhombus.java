package structural.adapter.clazz.thirdparty;

public class Rhombus implements ThirdPartyShape {
    private final double a;
    private final double b;

    public Rhombus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing rhombus with area " + area());
    }
}
