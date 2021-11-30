package structural.adapter.clazz;

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }

    @Override
    public String description() {
        return "Rectangle";
    }
}
