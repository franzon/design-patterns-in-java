package structural.decorator;

class SimpleDataSource implements DataSource {

    private String data = "";

    @Override
    public void write(String text) {
        data += text;
    }

    @Override
    public String read() {
        return data;
    }
}
