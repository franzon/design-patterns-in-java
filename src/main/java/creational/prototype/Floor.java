package creational.prototype;

class Floor implements Prototype{

    private final long area;

    public Floor(long area) {
        this.area = area;
    }

    public Floor(Floor floor) {
        this.area = floor.area;
    }

    @Override
    public Floor copy() {
        return new Floor(this);
    }
}
