package structural.decorator;

class DataSourceDecorator implements DataSource {

    private final DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void write(String text) {
        wrappee.write(text);
    }

    @Override
    public String read() {
        return wrappee.read();
    }
}
