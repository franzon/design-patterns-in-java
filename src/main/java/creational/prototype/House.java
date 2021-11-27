package creational.prototype;

class House implements Prototype {

    private final Floor floor;
    private final Ceil ceil;

    public House(Floor floor, Ceil ceil) {
        this.floor = floor;
        this.ceil = ceil;
    }

    public House(House house) {
        this.floor = house.floor.copy();
        this.ceil = house.ceil.copy();
    }

    public Floor getFloor() {
        return floor;
    }

    public Ceil getCeil() {
        return ceil;
    }

    @Override
    public House copy() {
        return new House(this);
    }
}
