package creational.builder;

class House {
    private final Floor floor;
    private final Ceil ceil;
    private final Pool pool;
    private final Window window;
    private final Door door;

    public House(HouseBuilder builder) {
        this.floor = builder.getFloor();
        this.ceil = builder.getCeil();
        this.pool = builder.getPool();
        this.window = builder.getWindow();
        this.door = builder.getDoor();
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
}
