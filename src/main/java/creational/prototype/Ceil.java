package creational.prototype;

class Ceil implements Prototype {
    private final String color;

    public Ceil(String color) {
        this.color = color;
    }

    public Ceil(Ceil ceil) {
        this.color = ceil.color;
    }

    @Override
    public Ceil copy() {
        return new Ceil(this);
    }

    public String getColor() {
        return color;
    }
}
