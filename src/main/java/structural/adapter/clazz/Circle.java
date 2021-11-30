package structural.adapter.clazz;

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public String description() {
        return "Circle";
    }
}
