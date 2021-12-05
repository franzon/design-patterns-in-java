package structural.decorator;

class ReverseDecorator extends DataSourceDecorator {
    public ReverseDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public void write(String text) {
        super.write(reversed(text));
    }

    @Override
    public String read() {
        return reversed(super.read());
    }

    private String reversed(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
