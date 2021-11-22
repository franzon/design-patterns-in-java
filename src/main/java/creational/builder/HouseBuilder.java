package creational.builder;

class HouseBuilder {
    private final Floor floor;
    private Ceil ceil;
    private Pool pool;
    private Window window;
    private Door door;

    public HouseBuilder(Floor floor) {
        if (floor == null)
            throw new IllegalArgumentException("Floor is required");

        this.floor = floor;
    }

    public HouseBuilder withCeil(Ceil ceil) {
        this.ceil = ceil;

        return this;
    }

    public HouseBuilder withPool(Pool pool) {
        this.pool = pool;

        return this;
    }

    public HouseBuilder withWindow(Window window) {
        this.window = window;

        return this;
    }

    public HouseBuilder withDoor(Door door) {
        this.door = door;

        return this;
    }

    public Floor getFloor() {
        return floor;
    }

    public Ceil getCeil() {
        return ceil;
    }

    public Pool getPool() {
        return pool;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public House build() {
        return new House(this);
    }
}
